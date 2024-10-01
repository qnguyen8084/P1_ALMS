/*
 * Quy Nguyen
 * Dhruv Shah
 * CS635
 * Adaptive Library Management System
 * ViewerInteractiveConsole.java
 * Sun, Sep 29 2024
 */

/*
 * Quy Nguyen
 * Dhruv Shah
 * CS635
 * Adaptive Library Management System
 * ViewerInteractiveConsole.java
 * Sun, Sep 29 2024
 */

/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * ViewerInteractiveConsole.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

import java.util.Scanner;

// Declaration of InteractiveConsole used for user interface
public class ViewerInteractiveConsole implements ViewerConsole {

    String WELCOME_MESSAGE = "Hello Administrator!\n" +
            "Welcome to the Adaptive Library Management System!";

    // Constructor for interactive console
    public ViewerInteractiveConsole() {
        System.out.println(WELCOME_MESSAGE);
        adminConsole();
    }

    public ViewerInteractiveConsole(int test) {
        return;
    }

    @Override
    public void adminConsole() {

        String ADMIN_OPTIONS =  "Please choose an option \n" +
                "(addBook, removeBook, listBooks,\n" +
                "addMember, removeMember, listMembers,\n" +
                "borrowBook, returnBook, listLoans, \n" +
                "search, listHistory, exit): ";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(ADMIN_OPTIONS);
            new AdminConsoleCommander(scanner.nextLine());
        }
    }
}
