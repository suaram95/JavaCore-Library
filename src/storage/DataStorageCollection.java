package storage;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class DataStorageCollection {

    private List<Book> books;

    public DataStorageCollection(int capacity) {
        books = new ArrayList<>(capacity);
    }

    public DataStorageCollection() {
        books = new ArrayList<>(16);
    }

    public void add(Book book) {
        books.add(book);
    }

    public void printBook() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void searchBookByTitle(String keyword) {
        boolean isFound = false;
        for (Book book : books) {
            if (book.getTitle().equals(keyword)){
                System.out.println(book);
                isFound=true;
            }
        }
        if (!isFound) {
            System.err.println("Book with title <" + keyword + "> wasn't found!!");
        }
    }

    private void deleteBookByIndex(String index){
        for (Book book : books) {
            books.remove(index);
        }
    }

    public void deleteBookByBookId(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)){
                deleteBookByIndex(bookId);
            }
        }
    }
}
