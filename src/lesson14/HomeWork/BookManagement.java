package lesson14.HomeWork;

import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        boolean closeProgram = false;
        Scanner scanner = new Scanner(System.in);
        while (!closeProgram){
            System.out.println("Select a menu:");
            System.out.println("1. Add a new book");
            System.out.println("2. Find a book");
            System.out.println("3. Update a book");
            System.out.println("4. Delete a book");
            System.out.println("0. Close program");
            String chosenMenu = scanner.nextLine();
            switch (chosenMenu){
                case "1":
                    addNewBook(bookList);
                    break;
                case "2":
                    findBookByKeyWord(bookList);
                case "3":
                   updateABookByISBN(bookList);
                    break;
                case "4":
//                    deleteBookByISBN();
                    break;
                case "0":
                    closeProgram = true;
                    break;
                default:
                    System.out.println("Wrong menu");
                    break;
            }
        }
    }

    private static void updateABookByISBN(List<Book> bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ISBN of the book to update: ");
        String findISBN = scanner.nextLine();
        Book foundBook = DataFactory.getBookDetailsByISBN(bookList, findISBN);
        System.out.println("Book to de updated: ");
        System.out.println(foundBook);
        System.out.println("Enter new Book Name value (DO NOT update, press Enter): ");
        String newBookName = scanner.nextLine();
        System.out.println("Enter new Author Name (DO NOT update, press Enter): ");
        String newAuthorName = scanner.nextLine();;
        System.out.println("Enter new Year of release value (DO NOT update, press Enter): ");
        String newYear = scanner.nextLine();
    }

    public static void addNewBook(List<Book> bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.println("Enter Book Name: ");
        String bookName = scanner.nextLine();
        System.out.println("Enter Author Name: ");
        String authorName = scanner.nextLine();
        System.out.println("Enter year of lease: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Wrong year format, please enter again: ");
        }
        int year = scanner.nextInt();
        Book newBook = new Book(ISBN,bookName, authorName, year);
        bookList.add(newBook);
        DataFactory.addNewBook(newBook);
        }

        public static void findBookByKeyWord(List<Book> bookList){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter keyword to find book");
            String keyword = scanner.nextLine();
            List<Book> foundBookList = DataFactory.getBookDetailsByKeyword(bookList, keyword);
            for(Book book : foundBookList){
                System.out.println(book);
            }

        }

    }

