package AdaptiveLibraryManagementSystem;

import java.util.Scanner;

public class UserInterface {

    public static void initializeInterface() {
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Adaptive Library Management System!");
        System.out.print("Login as: (admin, member)? ");
        command = scanner.nextLine();

        switch (command) {
            case "admin": {
                startAdminInterface();
            }

            case "member": {
                startMemberInterface();
            }
        }
    }

    public static void startAdminInterface() {
        BookManager bookManager = new BookManager();
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true) {
            System.out.println("Hello admin");
            System.out.print("Please choose and option " +
                    "(addBook, removeBook, listBooks, " +
                    "addMember, removeMember, listMembers, exit): ");
            command = scanner.nextLine();
            switch (command) {
                case "addBook":
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    BookManager.addBook(title, author);
                    break;
                case "removeBook":
                    System.out.print("Enter book ID: ");
                    int bookId = Integer.parseInt(scanner.nextLine());
                    BookManager.removeBook(bookId);
                    break;
                case "listBooks":
                    bookManager.listBooks();
                    break;
                case "addMember":
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    userManager.addMember(name);
                    break;
                case "removeMember":
                    System.out.print("Enter member ID: ");
                    int memberId = Integer.parseInt(scanner.nextLine());
                    userManager.removeMember(memberId);
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
            }
        }
    }

    public static void startMemberInterface() {
        BookManager bookManager = new BookManager();
        Scanner scanner = new Scanner(System.in);
        String command;
        int bookId;
        while (true) {
            System.out.println("Hello Member");
            System.out.print("Please choose and option " +
                    "(borrowBook, returnBook, listBooks, exit): ");
            command = scanner.nextLine();
            switch (command) {
                case "borrowBook":
                    System.out.print("Enter book ID to checkout: ");
                    bookId = Integer.parseInt(scanner.nextLine());
                    bookManager.borrowBook(bookId);
                    break;
                case "returnBook":
                    System.out.print("Enter book ID to return: ");
                    bookId = Integer.parseInt(scanner.nextLine());
                    bookManager.returnBook(bookId);
                    break;
                case "listBooks":
                    bookManager.listBooks();
                    break;
                case "exit":
                    scanner.close();
                    System.out.println("Thank you for using Adaptive Library Management System!");
                    System.exit(0);
                default:
                    System.out.println("Unknown command.");
            }
        }
    }
}
