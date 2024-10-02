package AdaptiveLibraryManagementSystem;

/**
 * The Member class represents a member of the library, inheriting from the User class
 * and implementing the FetchId interface to provide a unique member ID.
 */
public class Member extends User implements FetchId {
    // Unique ID for the member
    private int memberId;

    //Constructor to create a Member object with just the name (used when the memberId is not yet known).
     
    public Member(String name) {
        super(name);  // Call the User class constructor to set the name
    }

    // Constructor to create a Member object with both the member ID and name.
     
    public Member(int memberId, String name) {
        super(name);  // Call the User class constructor to set the name
        this.memberId = memberId;  // Initialize the member's unique ID
    }

    /**
     * Gets the unique ID of the member.
     * 
     * @return The member's ID.
     */
    @Override
    public int getId() {
        return memberId;
    }
}
