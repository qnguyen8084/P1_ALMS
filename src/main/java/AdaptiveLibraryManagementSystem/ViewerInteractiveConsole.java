/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * InteractiveConsole.java
 * Sept 7, 2024
 */

package AdaptiveLibraryManagementSystem;

import java.util.Scanner;

// Declaration of InteractiveConsole used for user interface
public class ViewerInteractiveConsole implements ViewerConsole {
    // Constructor for interactive console
    public ViewerInteractiveConsole() {
        System.out.println("Hello Administrator!\n" +
                "Welcome to the Adaptive Library Management System!");
        adminConsole();
    }

    public ViewerInteractiveConsole(int test) {
        return;
    }

    @Override
    public void adminConsole() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please choose an option \n" +
                    "(addBook, removeBook, listBooks,\n" +
                    "addMember, removeMember, listMembers,\n" +
                    "borrowBook, returnBook, listLoans, \n" +
                    "search, listHistory, exit): ");
        new AdminConsoleCommander(scanner.nextLine());
        }
    }
}
