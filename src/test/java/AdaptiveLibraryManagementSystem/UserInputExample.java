package AdaptiveLibraryManagementSystem;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * The UserInputExample class demonstrates how to take input from the user and produce output.
 * It uses a Scanner to read integers from an InputStream and a PrintStream to display output.
 */
public class UserInputExample {
    // Scanner for reading input from the user
    private Scanner scanner;
    // PrintStream for printing output
    private PrintStream printStream;

    /**
     * Constructor that initializes the Scanner and PrintStream using the provided InputStream and PrintStream.
     */
    public UserInputExample(InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);  // Initialize scanner with input stream
        this.printStream = printStream;  // Initialize print stream
    }

    /**
     * Starts the interaction with the user, prompting for two numbers and printing their sum.
     */
    public void start() {
        // Prompt for the first number
        printStream.println("Enter number 1");
        int x = scanner.nextInt();  // Read the first number

        // Prompt for the second number
        printStream.println("Enter number 2");
        int y = scanner.nextInt();  // Read the second number

        // Print the sum of the two numbers
        printStream.println("output: " + (x + y));
    }

    /**
     * The main method serves as the entry point of the application.
     * It creates an instance of UserInputExample and starts the input interaction.
     */
    public static void main(String[] args) {
        // Create an instance of UserInputExample using System.in and System.out
        UserInputExample userInputExample = new UserInputExample(System.in, System.out);


        // Start the main program (placeholder for other functionality)
        AdaptiveLibraryManagementSystem.main(args);  // Call the main method of the main system

        // Start the user interaction for input and output
    }
}
