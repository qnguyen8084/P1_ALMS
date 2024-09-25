package AdaptiveLibraryManagementSystem;

import java.util.Scanner;

public class AdminController implements AdminTransactions {
    UserManager userManager = new UserManager();
    BookManager bookManager = new BookManager();
    Scanner scanner = new Scanner(System.in);

    public AdminController(String command) {
        switch (command) {
            case "addBook":
                addBook();
                break;
            case "removeBook":
                removeBook();
                break;
            case "listBooks":
                bookManager.listBooks();
                break;
            case "addMember":
                addMember();
                break;
            case "removeMember":
                removeMember();
                break;
            case "listMembers":
                userManager.listUsers();
                break;
            case "exit":
                scanner.close();
                System.out.println("Thank you for using Adaptive Library Management System!");
                System.exit(0);
            default:
                System.out.println("Unknown command.");
                break;
        }
    }

    @Override
    public void addBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        BookManager.addBook(title, author);
    }

    @Override
    public void removeBook() {
        System.out.print("Enter book ID: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        BookManager.removeBook(bookId);

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
    public void search(String searchField, String searchString) {
    }
}
