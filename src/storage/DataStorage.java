package storage;

import model.Book;

public class DataStorage {

//    private Book[] books;
//    private int size = 0;
//
//    public DataStorage(int capacity) {
//        books = new Book[capacity];
//    }
//
//    public DataStorage() {
//        books = new Book[16];
//    }
//
//    public void add(Book book) {
//        if (size == books.length) {
//            extend();
//        } else books[size++] = book;
//    }
//
//    private void extend() {
//        Book[] temp = new Book[books.length + 10];
//        System.arraycopy(books, 0, temp, 0, books.length);
//        books = temp;
//    }
//
//    public void print() {
//        for (int i = 0; i < size; i++) {
//            System.out.println(books[i]);
//        }
//    }
//
//    public void searchBookByTitle(String keyword) {
//        boolean isFound = false;
//        for (int i = 0; i < size; i++) {
//            if (books[i].getTitle().contains(keyword)) {
//                System.out.println(books[i]);
//                isFound = true;
//            }
//        }
//        if (!isFound) {
//            System.err.println("Book with title <" + keyword + "> wasn't found!!");
//        }
//    }
//
//    private void deleteByIndex(int index) {
//        for (int i = index + 1; i < size; i++) {
//            books[i - 1] = books[index];
//        }
//        size--;
//    }
//
//    public void deleteBookByBookId(String bookId) {
//        for (int i = 0; i < size; i++) {
//            if (books[i].getBookId().equals(bookId)) {
//                deleteByIndex(i);
//            }
//        }
//    }


}
