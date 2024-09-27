/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * ConsoleInterface.java
 * Sept 7, 2024
 */

package AdaptiveLibraryManagementSystem;

import java.util.Scanner;

/**
 * ConsoleInterface is responsible for providing a user interface via the console
 * for interacting with the database through various operations defined in the Transactions interface.
 */
public class ConsoleInterface implements Transactions{
    DBConsoleAdapter adaptor = new DBConsoleAdapter();
    Scanner scanner = new Scanner(System.in);

    /**
     * Prompts the user to enter the title and author of a book via the console,
     * and then adds the book to the database using the DBConsoleAdapter.
     */
    @Override
    public void addBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        adaptor.addBook(new Book(title, author));
    }

    /**
     * Prompts the user to enter the book ID via the console and removes the book from the database
     * using the DBConsoleAdapter.
     */
    @Override
    public void removeBook() {
        System.out.print("Enter book ID: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        adaptor.removeBook(bookId);
    }

    @Override
     public void listBooks() {
        adaptor.listBooks();
    }

    @Override
    public void addMember() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Member member = new Member(name);
        adaptor.addMember(member);
    }

    @Override
    public void removeMember() {
        System.out.print("Enter member ID: ");
        int memberId = Integer.parseInt(scanner.nextLine());
        adaptor.removeMember(memberId);
    }

    @Override
    public void listMembers() {
        adaptor.listMembers();
    }

    @Override
    public void borrowBook() {
        int bookId;
        System.out.print("Enter memberId of patron: ");
        int memberId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter book ID to checkout: ");
        bookId = Integer.parseInt(scanner.nextLine());
        adaptor.borrowBook(memberId, bookId);
    }

    @Override
    public void returnBook() {
        int bookId;
        int memberId;
        System.out.print("Enter memberID or patron: ");
        memberId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter book ID to return: ");
        bookId = Integer.parseInt(scanner.nextLine());
        adaptor.returnBook(memberId, bookId);
    }

    @Override
    public void listLoans() {
        adaptor.listLoans();
    }

    @Override
    public void search(String searchField, String searchString) {
    }
}
