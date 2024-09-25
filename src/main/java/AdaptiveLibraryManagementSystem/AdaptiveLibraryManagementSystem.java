/*
Quy Nguyen
CS635
Lab01 - Priority Queue
9/9/24
Main.java
6
TODO: Error message when checking out book that is unavailable
TODO: User should have table joined with checked out books
TODO: Clean up interactive console code
TODO: Attach console interface to user and db interface
TODO: Comment all code
TODO: Create good documentation
TODO: Create Unit Tests

 */

package AdaptiveLibraryManagementSystem;

// Declaration of Main class
public class AdaptiveLibraryManagementSystem {
    // Defining main driver code
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Hello and welcome to Adaptive Library Management System!");
        // Initialize Database for persistent storage.
        DBManager.initializeDatabase();
        // Start user interface, cli
        new InteractiveConsole();


        // User interface in MVC this will be related to the controller

    }
}