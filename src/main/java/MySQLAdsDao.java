import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private List<Ad> ads;
    private Connection connection;

    public MySQLAdsDao() throws SQLException {
//        Config config = new Config();
//        Connection connection = DriverManager.getConnection(
//                config.getUrl(),
//                config.getUser(),
//                config.getPassword());
//        this.connection = connection;
    }

    public List<Ad> all() throws SQLException {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    public Long insert(Ad ad) throws SQLException {
        // make sure we have ads
        if (ads == null) {
            ads = generateAds();
        }
        // we'll assign an "id" here based on the size of the ads list
        // really the database would handle this
        ad.setId((long) ads.size());
        ads.add(ad);
        return ad.getId();
    }

    private List<Ad> generateAds() throws SQLException {
        List<Ad> ads = new ArrayList<>();


        return ads;
    }
}
