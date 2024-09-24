package AdaptiveLibraryManagementSystem;

public class User {
    protected int userID;
    protected String name;

    public User(int userID, String name) {
        this.userID = userID;
        this.name = name;
    }

    public void searchBook(String searchString) {
    }

    class Member extends User {
        public Member(int userID, String name) {
            super(userID, name);
        }

        public void borrowBook() {
        }

        public void returnBook() {
        }
    }

    class Admin extends User {
        public Admin(int userID, String name) {
            super(userID, name);
        }

        public void addBook() {
        }

        public void removeBook() {
        }
    }
}
