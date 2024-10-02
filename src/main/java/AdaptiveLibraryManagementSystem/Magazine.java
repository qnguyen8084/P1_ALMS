package AdaptiveLibraryManagementSystem;

// Class representing a magazine in the library.
public class Magazine extends LibraryItem implements LibraryItemInterface {
    private int magazineId; // ID of the magazine
    private final String journalist; // Journalist associated with the magazine

    // Constructor for a magazine with title and journalist. The magazine is available by default.
    public Magazine(String title, String journalist) {
        super(MAGAZINE, title);
        this.journalist = journalist;
    }

    // Constructor for a magazine with ID, title, journalist, and availability status.
    public Magazine(int magazineId, String title, String journalist, boolean isAvailable) {
        super(MAGAZINE, title, isAvailable);
        this.magazineId = magazineId;
        this.journalist = journalist;
    }

    // Implementation of the getId() method from the LibraryItemInterface.
    @Override
    public int getId() {
        return magazineId;
    }

    // Implementation of the getCreator() method from the LibraryItemInterface.
    @Override
    public String getCreator() {
        return journalist;
    }
}
