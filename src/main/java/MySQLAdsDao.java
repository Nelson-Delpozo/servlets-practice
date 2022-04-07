import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {
    private final Connection connection;
//    private List<Ad> ads;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword());

    }


    @Override
    public List<Ad> all() throws SQLException {
        Statement stmt;

        stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
        return createAdsFromResults(rs);

    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {

        List<Ad> ads = new ArrayList<>();

        while (rs.next()){
            ads.add(extractAd(rs));

        }
        return ads;
    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description")
        );
    }

    @Override
    public Long insert(Ad ad) throws SQLException {

        Statement statement = connection.createStatement();
        statement.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        rs.next();
        return rs.getLong(1);
    }

    private String createInsertQuery(Ad ad) {
        return "INSERT INTO ads(user_id, title, description) VALUES "
                + "(" + ad.getUserId() + ", " //(id,'title','description')
                + "'" + ad.getTitle() + "',"
                + "'" + ad.getDescription() + "')";
    }

//    private List<Ad> generateAds() throws SQLException {
//        List<Ad> ads = new ArrayList<>();
//        String selectQuery = "SELECT * FROM ads";
//        Statement stmt = connection.createStatement();
//        ResultSet rs = stmt.executeQuery(selectQuery);
//
//        while (rs.next()) {
//            System.out.println("rs.getString(\"title\") = " + rs.getString("title"));
//
//        }
//        return null;
//    }

}
