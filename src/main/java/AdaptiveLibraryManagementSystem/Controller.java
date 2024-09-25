package AdaptiveLibraryManagementSystem;

import java.util.Scanner;

class Controller implements Transactions{
    BookManager bookManager = new BookManager();
    Scanner scanner = new Scanner(System.in);

    public Controller(String command) {
        switch (command) {
            case "borrowBook":
                borrowBook();
                break;
            case "returnBook":
                returnBook();
                break;
            case "listBooks":
                bookManager.listBooks();
                break;
            case "exit":
                System.out.println("Thank you for using Adaptive Library Management System!");
                System.exit(0);
            default:
                System.out.println("Unknown command.");
                break;
        }

    }

    @Override
    public void borrowBook() {
        int bookId;
        System.out.print("Enter book ID to checkout: ");
        bookId = Integer.parseInt(scanner.nextLine());
        bookManager.borrowBook(bookId);
    }

    @Override
    public void returnBook() {
        int bookId;
        System.out.print("Enter book ID to return: ");
        bookId = Integer.parseInt(scanner.nextLine());
        bookManager.returnBook(bookId);
    }

    @Override
    public void search(String searchField, String searchString) {
        BookManager bookManager = new BookManager();
        Scanner scanner = new Scanner(System.in);

    }
}
