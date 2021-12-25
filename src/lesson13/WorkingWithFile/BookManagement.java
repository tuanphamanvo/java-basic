package lesson13.WorkingWithFile;

import java.sql.SQLOutput;
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

        //Save
        Book book = new Book(ISBN, bookTitle, authorName, year);
        bookList.add(book);
        bookList.add(book);

//        //Retrieve
//        System.out.println("Book ISBN to find: ");
//        String toFindISBN = scanner.nextLine();
//        Book foundBook = null;
//        for(Book bookItem : bookList){
//            if(bookItem.getISBN().equalsIgnoreCase(toFindISBN)){
//                foundBook = bookItem;
//                break;
//            }
//        }
//        if(foundBook==null){
//            System.out.println("There is NO book with ISBN: " + toFindISBN);
//        } else {
//            System.out.println(foundBook);
//        }

        //Save into file
        String bookFilePath = System.getProperty("user.dir").concat("/bookList.txt");
        DataFactory.saveBookList(bookList, bookFilePath);
    }
}
