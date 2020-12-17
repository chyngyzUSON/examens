public class Art {
    private String name;
    private Book[] books;
    private static int count;

    public Art(){}
    public Art(String name, Book[] books) {
        this.books = books;
        count++;
    }

    public void addBook(int count){
        count++;
    }
    public Book consoleOutput(Book[] books){
        return getBooks()[count];
    }
    public Book consoleAllOutput(Book[] books, int count){
        return "Количества книг: " + count + ", в отделе: " + name + ",\n " + getBooks();
    }
    public String Search(String name){
        return getName();
    }

    @Override
    public String toString() {
        return name + ", " + count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

}
