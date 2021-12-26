package lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>(); //In-memory Storage

        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ISBN");
        String ISBN = scanner.nextLine();
        System.out.println("Please enter book title");
        String bookTitle = scanner.nextLine();
        System.out.println("Please enter Author Name");
        String authorName = scanner.nextLine();
        System.out.println("Please enter year");
        int year = Integer.valueOf(scanner.nextLine());
//
//        //Save
        Book book = new Book(ISBN, bookTitle, authorName, year);
        bookList.add(book);

//        //Save into file
        String bookFilePath = System.getProperty("user.dir").concat("/src/lesson14/bookList.txt");
        DataFactory.saveBookList(bookList, bookFilePath);

        //Read bookList data
        List<Book> bookDB = DataFactory.readBook(bookFilePath);
        for(Book bookInFile : bookDB){
            System.out.println(bookInFile);
        }
    }
}
