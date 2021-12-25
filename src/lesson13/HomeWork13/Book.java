package lesson13.HomeWork13;

public class Book {
    private String ISBN;
    private String bookTitle;
    private String authorName;
    private int year;

    public Book(String ISBN, String bookTitle, String authorName, int year) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
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
        return "Book details: " +
                "ISBN='" + ISBN + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", authorName='" + authorName + '\'' +
                ", year=" + year;
    }
}
