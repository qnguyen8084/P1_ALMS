/*
Quy Nguyen
CS635
Lab01 - Priority Queue
9/9/24
Main.java

TODO: Add exception handling where needed [...]
TODO: Comment Code
TODO: Add documentation
TODO: Consolidate UserManager and BookManager into DB Manager
TODO: DBManager methods will be updated to take classes
TODO: Simplify AdaptiveLibraryManagementSystem.UserManager.Member model by removing User Class and Admin class.
TODO: Create necessary interfaces
TODO: Add command design pattern
TODO: Use strategy pattern
TODO: Implement Search methods
TODO: Implement loanBook with loan table interaction
TODO: Implement method to list members with loaned books
TODO: Remove interface implementation out of AdaptiveLibraryManagementSystem.UserManager.Member class and into new class
TODO: Take builder or factory approach to customize ui dependent on user admin or user
TODO: Add test case for empty string in user input

 */

package AdaptiveLibraryManagementSystem;

// Declaration of Main class
public class AdaptiveLibraryManagementSystem {
    // Defining main driver code
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Hello and welcome to Adaptive Library Management System!");
        // Initialize Database for persistent storage.
        new DBManager();
        // Start user interface, cli
        new InteractiveConsole();
    }
}