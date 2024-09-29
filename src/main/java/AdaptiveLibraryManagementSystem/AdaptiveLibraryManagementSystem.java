/*
 * Quy Nguyen
 * Dhruv Shah
 * CSC635
 * Adaptive Library Management System
 * AdaptiveLibraryManagementSystem.java
 * Sept 7, 2024
 */

/*
TODO: Comment code
        - AdminCommander (Done)
        - Book
        - Console
        - ConsoleInterface
        - DBConsoleAdapter
        - DBManager
        - InteractiveConsole
        - Loan
        - Member
        - Transactions
TODO: Add test cases
        - Book
        - Console
        - ConsoleInterface
        - DBConsoleAdapter
        - DBManager
        - InteractiveConsole
        - Loan
        - Member
        - Transactions
TODO: Add test cases comments
        - Book
        - Console
        - ConsoleInterface
        - DBConsoleAdapter
        - DBManager
        - InteractiveConsole
        - Loan
        - Member
        - Transactions
TODO: Refactor to assignment specifications
TODO: Complete and review documentation
TODO: Implement search functions
    - User/Admin requests search by column then with specific keyword
    - searchable tables
    - members: id, name
    - books: id, title, author, isAvailable
    - loans: id, bookId, memberId
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
        new InteractiveConsole();
    }

    // Declared and defined printMessage function to help with readability.
    public static void printMessage(String message) {
        System.out.println(message);
    }

}