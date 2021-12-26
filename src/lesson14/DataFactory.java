package lesson14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {
    public static void saveBookList(List<Book> bookList, String path) {


        //IO try catch
        //Close Resources

        //Try with resources
        try(
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            ){
            for(Book book: bookList){
                String bookData = book.getISBN() + ";" + book.getTitle()+";"+book.getAuthorName()+";"+book.getYear();
                bufferedWriter.write(bookData);
                bufferedWriter.newLine();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        }

    public static List<Book> readBook(String filePath){

        List<Book> bookList = new ArrayList<>();
        try(        FileInputStream fileInputStream = new FileInputStream(filePath);
                    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    ) {
            String dataLine = bufferedReader.readLine();
            while(dataLine != null){
                String[] bookData = dataLine.split(";");
                String ISBN = bookData[0];
                String title = bookData[1];
                String authorName = bookData[2];
                int year = Integer.valueOf(bookData[3]);
                Book book = new Book(ISBN, title,authorName, year);
                bookList.add(book);
                dataLine = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;

    }

    }

