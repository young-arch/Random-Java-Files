public class Ztestbook {
    private String title;
    private String publisher;
    private String author;

    public Ztestbook(String textFile, String auth, String pub) {
        title = textFile;
        author = auth;
        publisher = pub;
    }

    public Ztestbook(Ztestbook object2) {
        title = object2.title;
        publisher = object2.publisher;
        author = object2.author;
    }

    public void set(String textFile, String auth, String pub) {
        title = textFile;
        author = auth;
        publisher = pub;
    }

    public String tostring() {

        String str = "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher;
        return str;

    }
}
