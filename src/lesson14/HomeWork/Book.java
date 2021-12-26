package lesson14.HomeWork;

public class Book {
    private String ISBN;
    private String bookName;
    private String authorName;
    private int year;

    public Book(String ISBN, String bookName, String authorName, int year) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.authorName = authorName;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book details: \n"
                + "+ ISBN: " + ISBN + "\n"
                + "+ Book Name: " + bookName + "\n"
                + "+ Author Name: " + authorName + "\n"
                + "+ Year of release: " + year;
    }
}
