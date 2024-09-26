package AdaptiveLibraryManagementSystem;

import java.util.Scanner;

public class ConsoleInterface implements ConsoleTransactions{
    BookManager bookManager = new BookManager();
    UserManager userManager = new UserManager();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        bookManager.addBook(title, author);
    }

    @Override
    public void removeBook() {
        System.out.print("Enter book ID: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        bookManager.removeBook(bookId);
    }

    @Override
    public void addMember() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        userManager.addMember(name);
    }

    @Override
    public void removeMember() {
        System.out.print("Enter member ID: ");
        int memberId = Integer.parseInt(scanner.nextLine());
        userManager.removeMember(memberId);
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
    public void listMembers() {
        userManager.listMembers();
    }

    @Override
    public void listBooks() {
        bookManager.listBooks();
    }

    @Override
    public void listLoans() {
    }

    @Override
    public void search(String searchField, String searchString) {
    }
}
