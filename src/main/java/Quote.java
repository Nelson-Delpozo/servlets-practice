import java.io.Serializable;

public class Quote {

    private long id;
    private String content;
    private String author;

    public Quote() {
    }

    public Quote(String content, String author, long id){
        this.content = content;
        this.author = author;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return ("Author: " + this.getAuthor() +
                " Quote: " + this.getContent());
    }
}
