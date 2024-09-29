/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * AdaptiveLibraryManagementSystemTest.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// These are the unit test for the AdaptiveLibraryManagementSystem
// It tests the printMessage message by comparing output to expected output.
// It testes DBManager class object instantiation by checking if object exists after instantiation call.
// It testes InteractiveConsole() class object instantiation by checking if object exists after
// instantiation call.

public class AdaptiveLibraryManagementSystemTest {

    // This is used to redirect output stream from console to ByteArray.
    ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(outStream);
    PrintStream originalOutStream = System.out;
  /*  String inputString = "listMembers";
    InputStream inStream = new ByteArrayInputStream(inputString.getBytes());
    InputStream originalInStream = System.in;
    Scanner scanner = new Scanner(System.in);
    String readString = scanner.nextLine();*/

    // Redirects System.out from console to ByteArrayOutputStream before the start of each test.
    @BeforeEach
    public void setUp() {
        System.setOut(ps);
    //    System.setIn(inStream);
    }

    // Restores System.out from ByteArrayOutputStream to original stream after each test.
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOutStream);
      //  System.setIn(originalInStream);
    }

    // Tests printMessage()
    @Test
    public void testPrint_Message() {
        String MESSAGE = "Welcome to Adaptive Library Management System!";
        AdaptiveLibraryManagementSystem.printMessage(MESSAGE);
        System.setOut(originalOutStream);
        System.out.println(outStream.toString());
        assertEquals(MESSAGE, outStream.toString().replaceAll("[\\n\\r]", ""));
    }

    // Test DBManager class object instantiation
    @Test
    public void testDBManager_Initialization_Expects_NotNull() {
        DBManager dbManager = new DBManager();
        assertNotNull(dbManager);
    }

    // Test InteractiveConsole class object instantiation
    @Test
    public void testInteractiveConsole_Initialization_Expects_NotNull() {
        int TEST = 1;
        ViewerInteractiveConsole viewerInteractiveConsole = new ViewerInteractiveConsole(TEST);
        assertNotNull(viewerInteractiveConsole);
    }

    @Test
    public void testInteractiveConsole() {

        AdaptiveLibraryManagementSystem.main(null);
        System.setOut(originalOutStream);
        System.out.println(outStream.toString());
        getConsoleAndSwitch();
    }


    public void getConsoleAndSwitch() {
        String consoleMessage = outStream.toString();
        System.setOut(ps);
        originalOutStream.println(consoleMessage);
        System.setOut(originalOutStream);
//        String readString = scanner.nextLine();


    }

}