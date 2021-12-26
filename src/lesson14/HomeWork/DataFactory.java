package lesson14.HomeWork;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    private static String bookFilePath = System.getProperty("user.dir").concat("/src/lesson14/HomeWork/bookList.txt");
    public static void addNewBook(Book newBook){
        try(
                FileOutputStream fileOutputStream = new FileOutputStream(bookFilePath, true);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        ) {
                String bookData = newBook.getISBN()+";"+newBook.getBookName()+";"+newBook.getAuthorName()+";"+newBook.getYear();
                bufferedWriter.write(bookData);
                bufferedWriter.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Book> getBookDetailsByKeyword(List<Book> bookList, String keyword){
        List<Book> bookListFound = new ArrayList<>();
        try(
                FileInputStream fileInputStream = new FileInputStream(bookFilePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                ){
            String bookLine = bufferedReader.readLine();
            String[] bookData = bookLine.split(";");

            ///
                if(bookData[0].toLowerCase().contains(keyword.toLowerCase()) ||bookData[1].toLowerCase().contains(keyword.toLowerCase())||bookData[2].toLowerCase().contains(keyword.toLowerCase())||bookData[3].toLowerCase().equalsIgnoreCase(keyword)) {
                    String ISBN = bookData[0];
                    String bookName = bookData[1];
                    String authorName = bookData[2];
                    int year = Integer.parseInt(bookData[3]);
                    Book bookFound = new Book(ISBN, bookName,authorName, year);
                    bookListFound.add(bookFound);
                }

        }catch (Exception e){e.printStackTrace();}
        return bookListFound;
    }

    public static Book getBookDetailsByISBN(List<Book> bookList, String findISBN) {
        Book bookFound = null;
        try (
                FileInputStream fileInputStream = new FileInputStream(bookFilePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String bookLine = bufferedReader.readLine();
            String[] bookData = bookLine.split(";");

            ///
            if (bookData[0].toLowerCase().equalsIgnoreCase(findISBN)) {
                String ISBN = bookData[0];
                String bookName = bookData[1];
                String authorName = bookData[2];
                int year = Integer.parseInt(bookData[3]);
                bookFound = new Book(ISBN, bookName, authorName, year);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookFound;
    }
}
