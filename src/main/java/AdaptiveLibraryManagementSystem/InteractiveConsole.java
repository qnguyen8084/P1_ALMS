package AdaptiveLibraryManagementSystem;

import java.util.Scanner;

// Declaration of InteractiveConsole used for user interface
public class InteractiveConsole implements Console {
    // Constructor for interactive console
    public InteractiveConsole() {
        // Initialize String variable with result from userSelection() call
        String command = userSelection();
        // Switch statement to evaluate result from command
        switch (command) {
            // If command == "admin" start administrative console
            case "admin":
                adminConsole();
            // If command is a name
            case "member":
                memberConsole();
            case "exit":
                System.exit(0);
            default:
                System.out.println(command + " is not a valid option");
        }
    }

    @Override
    public String userSelection() {
        Scanner scanner = new Scanner(System.in);
        String command;
        System.out.println("Welcome to the Adaptive Library Management System!");
        System.out.print("Login as: (admin, member, exit)? ");
        command = scanner.nextLine();
        return command;
    }

    @Override
    public void adminConsole() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hello admin");
            System.out.print("Please choose and option " +
                    "(addBook, removeBook, listBooks, " +
                    "addMember, removeMember, listMembers, exit): ");
        new AdminController(scanner.nextLine());
        }
    }

    @Override
    public void memberConsole() {
        Scanner scanner = new Scanner(System.in);
        // Add code to check  user in databases
        while (true) {
            System.out.println("Hello Member");
            System.out.print("Please choose and option " +
                    "(borrowBook, returnBook, listBooks, exit): ");
            new UserController(scanner.nextLine());
        }
    }
}
