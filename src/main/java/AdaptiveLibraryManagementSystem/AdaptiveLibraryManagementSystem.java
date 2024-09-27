/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * AdaptiveLibraryManagementSystem.java
 * Sept 7, 2024
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