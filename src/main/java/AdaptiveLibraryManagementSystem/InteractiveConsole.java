package AdaptiveLibraryManagementSystem;

import java.util.Scanner;

public class InteractiveConsole implements Console {

    public InteractiveConsole() {
        String command = userSelection();
        switch (command) {
            case "admin": {
                while (true) callAdminFunction(adminConsole());
            }
            case "member": {
                while (true) callMemberFunction(memberConsole());
            }
        }//
    }

    @Override
    public String userSelection() {
        Scanner scanner = new Scanner(System.in);
        String command;
        System.out.println("Welcome to the Adaptive Library Management System!");
        System.out.print("Login as: (admin, member)? ");
        command = scanner.nextLine();
        return command;
    }

    @Override
    public String adminConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello admin");
        System.out.print("Please choose and option " +
                "(addBook, removeBook, listBooks, " +
                "addMember, removeMember, listMembers, exit): ");
        return scanner.nextLine();
    }

    @Override
    public String memberConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Member");
        System.out.print("Please choose and option " +
                "(borrowBook, returnBook, listBooks, exit): ");
        return scanner.nextLine();
    }

    public void callAdminFunction(String command) {
        BookManager bookManager = new BookManager();
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);
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
                break;
        }

    }

    public void callMemberFunction(String command) {
        BookManager bookManager = new BookManager();
        Scanner scanner = new Scanner(System.in);
        int bookId;
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
                break;
        }

    }
}
