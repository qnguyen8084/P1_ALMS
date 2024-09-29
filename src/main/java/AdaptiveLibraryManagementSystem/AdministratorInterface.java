/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * ConsoleInterface.java
 * Sept 7, 2024
 */

package AdaptiveLibraryManagementSystem;

import java.util.Scanner;


public class AdministratorInterface implements AdminOperations {
    DBConsoleAdapter adaptor = new DBConsoleAdapter();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void addBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        adaptor.addBook(new Book(title, author));
    }


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
    public void listHistory() {
        adaptor.listHistory();
    }

    @Override
    public void search() {
        String searchField;
        String searchString;
        System.out.print("Enter search field: ");
        searchField = scanner.nextLine();
        System.out.print("Enter search string: ");
        searchString = scanner.nextLine();
        adaptor.search(searchField, searchString);
    }

}
