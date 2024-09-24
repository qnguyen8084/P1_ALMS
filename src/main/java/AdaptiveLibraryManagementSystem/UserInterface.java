package AdaptiveLibraryManagementSystem;

import java.util.Scanner;

public class UserInterface {

    public static void initializeInterface(BookManager bookManager, UserManager userManager) {
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Adaptive Library Management System!");
        System.out.print("Login as: (admin, member)? ");
        command = scanner.nextLine();

        switch (command) {
            case "admin": {
                startAdminInterface(bookManager, userManager);
            }

            case "member": {
                startMemberInterface(bookManager);
            }
        }
    }

    public static void startAdminInterface(BookManager bookManager, UserManager userManager) {
        Scanner scanner = new Scanner(System.in);
        int command;
        while (true) {
            System.out.println("Welcome admin");
            System.out.println("1: Add book");
            System.out.println("2: remove book");
            System.out.println("3: List books");
            System.out.println("4: Add member");
            System.out.println("5: Remove member");
            System.out.println("6: List members");
            System.out.println("0: exit");
            System.out.print("What would you like to do today? ");
            command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    BookManager.addBook(title, author);
                    break;
                case 2:
                    break;
                case 3:
                    bookManager.listBooks();
                    break;
                case 4:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    userManager.addUser(name);
                    break;
                case 5:
                    break;
                case 6:
                    userManager.listUsers();
                    break;
                case 0:
                    scanner.close();
                    System.out.println("Thank you for using Adaptive Library Management System!");
                    return;

                default:
                    System.out.println("Unknown command.");
            }
        }
    }

    public static void startMemberInterface(BookManager bookManager) {
        Scanner scanner = new Scanner(System.in);
        int command;
        int bookId;
        while (true) {
            System.out.println("Welcome member");
            System.out.println("1: borrowBook");
            System.out.println("2: returnBook");
            System.out.println("3: List books");
            System.out.println("0: exit");
            System.out.print("What would you like to do today? ");
            command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 1:
                    System.out.print("Enter book ID to checkout: ");
                    bookId = Integer.parseInt(scanner.nextLine());
                    bookManager.borrowBook(bookId);
                    break;
                case 2:
                    System.out.print("Enter book ID to return: ");
                    bookId = Integer.parseInt(scanner.nextLine());
                    bookManager.returnBook(bookId);
                    break;
                case 3:
                    bookManager.listBooks();
                    break;
                case 0:
                    scanner.close();
                    System.out.println("Thank you for using Adaptive Library Management System!");
                    return;

                default:
                    System.out.println("Unknown command.");
            }
        }
    }
}
