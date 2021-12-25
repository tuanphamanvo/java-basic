package lesson13.WorkingWithFile;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
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
    }
