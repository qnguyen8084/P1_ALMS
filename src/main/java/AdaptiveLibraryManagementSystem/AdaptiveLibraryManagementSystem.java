/*
Quy Nguyen
CS635
Lab01 - Priority Queue
9/9/24
Main.java
6
TODO: Create initial interface
TODO: Initialize database connection singleton
TODO: User class composite/builder
TODO: Transaction interface command
TODO: MVC approach
TODO: Start on Controller
TODO: Add models
TODO: Create views
TODO:
TODO:


 */

package AdaptiveLibraryManagementSystem;
import java.sql.Connection;

// Declaration of Main class
public class AdaptiveLibraryManagementSystem {
    // Defining main driver code
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Hello and welcome to Adaptive Library Management System!");
        // Initialize Database for persistent storage.
        Connection conn = DBManager.initializeDatabase();
        UserInterface.initializeInterface();


        // User interface in MVC this will be related to the controller

    }
}