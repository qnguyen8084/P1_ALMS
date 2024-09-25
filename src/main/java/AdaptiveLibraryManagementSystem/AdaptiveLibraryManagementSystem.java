/*
Quy Nguyen
CS635
Lab01 - Priority Queue
9/9/24
Main.java

TODO: Decouple console into layers
TODO: Bring more code up to Driver/Top level
TODO: Implement command design pattern for requests from user and admin
TODO: Implement builder for creation of books
TODO: Implement adapter to interface with SQLite interface (Goal is to pass objects around)
TODO: Model of MVC paradigm?
TODO: Implement method for disaster recovery or data corruption of database
TODO: Create unit tests
TODO: Comment Code
TODO: Write documentation. Design patterns used and why. The benefits.
TODO: Design patterns MVC model, command, adapter, strategy?, state
TODO: Add user registration if user does not exist to

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