
package AdaptiveLibraryManagementSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViewerInteractiveConsoleTest {

    @Test
    void adminConsole() {
        // instantiate class with test constructor to avoid the infinite loop in main constructor
        ViewerInteractiveConsole viewerInteractiveConsole = new ViewerInteractiveConsole(1);
        assertNotNull(viewerInteractiveConsole, "Object creation failed.");
    }

    @Test
    void testConstructor() {
        // instantiating class without test constructor would start an infinite console loop
        // this is just to illustrate that a test like this can't practically be implemented
        // without changes to the structure of ViewerInteractiveConsole
        assertThrows(StackOverflowError.class, ViewerInteractiveConsole::new,
                "Infinite console loop started.");
    }


}
