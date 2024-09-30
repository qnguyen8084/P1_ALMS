/*
 * Quy Nguyen
 * Dhruv Shah
 * CS635
 * Adaptive Library Management System
 * AdaptiveLibraryManagementSystem.java
 * Sun, Sep 29 2024
 */

/*
TODO: Refector to requirements (mostly done)
TODO: Design documentation, class diagrams, interaction diagrams, db schema
TODO: Unit Tests... Did some manual testing and played around with the test generator
        Did not add our header template because we didn't actually write them
TODO: Exception handling:
        known issues:
        Search function will crash program if you enter field that does not exist?
        Or is because I used prepared statement wrong? does (set[type], var) only used to
        inject type values int sql query. I tried to use method to set tableName and column,
        but it broke the search function
        Need to reply when items are not found or does not exist. user book loan table...
TODO: Interfaces can be simplified or abstracted for common methods/behavior in different classes
        dbmanager, book, member, bookmanager, usermanager, etc...
TODO: Negative testing
TODO: Try to get close to 100 code coverage or at least cover important functions and interclass object
    interactions
TODO: Comment Code
TODO: Clean Up Code
TODO: Learn about Lambda functions
TODO: Find ways to reduce coupling

*/


package AdaptiveLibraryManagementSystem;

// Declaration of Main class
public class AdaptiveLibraryManagementSystem {

    // Defining main driver code
    // Definition of main() and entrypoint into the AdaptiveLibraryManagementSystem application.0
    // It first instantiates a DBManager object with new DBManager() to initialize the database and it's
    // tables if it does not already exist.
    // It then instantiates an InteractiveConsole with new Interactive console to output prompts to the
    // user.
    public static void main(String[] args) {

        // Created a constant String for welcome message to encourage with readability.
        String WELCOME_MESSAGE = "Welcome to Adaptive Library Management System!";

        // Welcome message
        printMessage(WELCOME_MESSAGE);

        // Initialize Database for persistent storage.
        DBManager.initializeDatabase();
        DBHistoryLogger.initializeDatabase();

        // Start user interface, cli
        new ViewerInteractiveConsole();
    }

    // Declared and defined printMessage function to help with readability.
    public static void printMessage(String message) {
        System.out.println(message);
    }

}