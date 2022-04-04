import java.util.Date;

public class BeanTest {

    public static void main(String[] args) {

        Album newAlbum = new Album();
        newAlbum.setId(1);
        newAlbum.setArtist("Prince");
        newAlbum.setName("Purple Rain");
        newAlbum.setGenre("Pop");
        newAlbum.setReleaseDate(new Date(1984,01,01));
        newAlbum.setSales(14.5F);

        System.out.println(newAlbum.getName());


        Quote newQuote = new Quote();
        newQuote.setAuthor("Ernest Hemingway");
        newQuote.setContent("Ask not for whom the bell tolls, it tolls for thee.");

        System.out.println(newQuote.getAuthor());
        System.out.println(newQuote.getContent());

        Author newAuthor = new Author();
        newAuthor.setFirstName("Bob");
        newAuthor.setLastName("Sagat");
        newAuthor.setId(5);

        System.out.println("The new author is: " + newAuthor.getFirstName() + " " + newAuthor.getLastName());







    }




}
