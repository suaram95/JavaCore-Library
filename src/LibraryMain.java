import model.Author;
import model.Book;
import storage.DataStorageCollection;

import java.util.Scanner;

public class LibraryMain implements Commands {
    private static Scanner scanner = new Scanner(System.in);
//    private static DataStorage dataStorage = new DataStorage();
    private static DataStorageCollection dataStorage=new DataStorageCollection();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommand();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    isRun=false;
                    System.out.println("Program was closed");
                    break;
                case ADD:
                    addBook();
                    break;
                case SEARCH:
                    searchBook();
                    break;
                case DELETE:
                    deleteBook();
                    break;
                case PRINT_ALL:
                    dataStorage.printBook();
                    break;
                default:
                    System.err.println("You entered Wrong Command!!");
            }

        }

    }

    private static void printCommand() {
        System.out.println("Imput " + EXIT + " to EXIT program");
        System.out.println("Input " + ADD + " to ADD BOOK");
        System.out.println("Input " + SEARCH + " to SEARCH BOOK");
        System.out.println("Input "+ DELETE+" to DELETE BOOK FROM STORAGE");
        System.out.println("Input "+PRINT_ALL+" to SEE ALL BOOKS");
    }

    private static void addBook() {

        System.out.println("Input data about Author /Name, Surname, E-mail, Gender/");

        String authorStr = scanner.nextLine();
        String[] authorData = authorStr.split(",");

        Author author=new Author();
        author.setName(authorData[0]);
        author.setSurname(authorData[1]);
        author.setEmail(authorData[2]);
        author.setEmail(authorData[3]);

        System.out.println("Input data about Book /bookID, Title, Description, Price, Count/");
        String bookStr = scanner.nextLine();
        String[] bookData = bookStr.split(",");

        Book book=new Book();
        book.setBookId(bookData[0]);
        book.setTitle(bookData[1]);
        book.setDescription(bookData[2]);
        book.setAuthorName(author);
        book.setPrice(Double.parseDouble(bookData[3]));
        book.setCount(Integer.parseInt(bookData[4]));
        dataStorage.add(book);
        dataStorage.printBook();
    }

    private static void searchBook() {
        System.out.println("Input keyword to search Book");
        String keyword = scanner.nextLine();
        dataStorage.searchBookByTitle(keyword);
    }

    private static void deleteBook() {
        dataStorage.printBook();
        System.out.println("Input Book ID to delete");
        String bookId = scanner.nextLine();
        dataStorage.deleteBookByBookId(bookId);
        System.out.println("Book with bookID <"+bookId+"> was deleted from storage");
        dataStorage.printBook();
    }
}
