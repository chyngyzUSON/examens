import java.time.LocalDate;

public class Book {
    private String ident;
    private String authorName;
    private String bookName;
    private LocalDate editionYear;


    public Book(){}
    public Book(String ident, String authorName, String bookName, LocalDate editionYear) {
        this.ident = ident;
        this.authorName = authorName;
        this.bookName = bookName;
        this.editionYear = editionYear;

    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public LocalDate getEditionYear() {
        return editionYear;
    }

    public void setEditionYear(LocalDate editionYear) {
        this.editionYear = editionYear;
    }

}
