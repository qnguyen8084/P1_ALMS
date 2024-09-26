package AdaptiveLibraryManagementSystem;

import java.util.Scanner;

public class ConsoleInterface implements AdminTransactions{
    DBManager db = new DBManager();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        db.addBook(title, author);
    }

    @Override
    public void removeBook() {
        System.out.print("Enter book ID: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        db.removeBook(bookId);
    }

    @Override
     public void listBooks() {
        db.listBooks();
    }

    @Override
    public void addMember() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        db.addMember(name);
    }

    @Override
    public void removeMember() {
        System.out.print("Enter member ID: ");
        int memberId = Integer.parseInt(scanner.nextLine());
        db.removeMember(memberId);
    }

    @Override
    public void listMembers() {
        db.listMembers();
    }

    @Override
    public void borrowBook() {
        int bookId;
        System.out.print("Enter book ID to checkout: ");
        bookId = Integer.parseInt(scanner.nextLine());
        db.borrowBook(bookId);
    }

    @Override
    public void returnBook() {
        int bookId;
        System.out.print("Enter book ID to return: ");
        bookId = Integer.parseInt(scanner.nextLine());
        db.returnBook(bookId);
    }

    @Override
    public void listLoans() {
    }

    @Override
    public void search(String searchField, String searchString) {
    }
}
