package lesson13.HomeWork13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean closeProgram = false;
        while(!closeProgram){
            System.out.println("Please choose a menu:");
            System.out.println("1. Add new book");
            System.out.println("2. Find a book");
            System.out.println("0. Exit program");
            String chosenMenu = scanner.nextLine();
            switch (chosenMenu) {
                case "1":
                    addBook(bookList);
                    break;
                case "2":
                    findBook(bookList);
                    break;
                case "0":
                    closeProgram = true;
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }

        }
    }
    public static void addBook(List<Book> bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ISBN:");
        String ISBN = scanner.nextLine();
        System.out.println("Enter book title:");
        String bookTitle = scanner.nextLine();
        System.out.println("Enter author name:");
        String authorName = scanner.nextLine();
        System.out.println("Enter the year of released:");
        while (!scanner.hasNextInt()) {scanner.next();
            System.out.println("Wrong format, input again");};
        int year = scanner.nextInt();
        Book newBook = new Book(ISBN, bookTitle, authorName, year);
        bookList.add(newBook);
    }
    public static void findBook(List<Book> bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter keyword to find your book");
        String keyword = scanner.nextLine();
        boolean noBookMatched = true;
        for(Book book:bookList){
            boolean matched = false;
            if(book.getISBN().toLowerCase().contains(keyword.toLowerCase())){
                matched = true;
            }
            if (book.getAuthorName().toLowerCase().contains(keyword.toLowerCase())) {
                matched = true;
            }
            if (book.getBookTitle().toLowerCase().contains(keyword.toLowerCase())){
                matched = true;
            }
            if ((Integer.toString(book.getYear()))==keyword){
                matched = true;
            }
            if(matched){
                System.out.println(book);
                matched = false;
                noBookMatched = false;
            }
        }
        if(noBookMatched){
            System.out.println("There is NO book matched to searched keyword");
        }
    }
}
