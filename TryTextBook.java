public class TryTextBook {

    private String title;
    private String author;
    private String publisher;

    public TryTextBook(String textTitle, String auth, String pub) {
        title = textTitle;
        author = auth;
        publisher = pub;
    }

    public TryTextBook(TryTextBook object2) {

        title = object2.title;
        author = object2.author;
        publisher = object2.author;

    }

    public void set(String textTile, String auth, String pub) {
        title = textTile;
        author = auth;
        publisher = pub;

    }

    public String toString() {

        String str = "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher;
        return str;
    }
}
