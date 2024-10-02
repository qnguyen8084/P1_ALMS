
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

}
