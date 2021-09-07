package javabeans;

public class Quote {

    private int id;
    private Author author;
    private String text;

    public Quote(){
    }

    public Quote(int id, Author author, String quote) {
        this.id = id;
        this.author = author;
        this.text = quote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
