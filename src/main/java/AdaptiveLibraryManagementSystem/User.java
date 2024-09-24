package AdaptiveLibraryManagementSystem;

abstract class User {
    protected int userID;
    protected String name;

    public User(int userID, String name) {
        this.userID = userID;
        this.name = name;
    }

    class Member extends User implements Transactions{
        public Member(int userID, String name) {
            super(userID, name);
        }

        @Override
        public void borrowBook(int bookId) {

        }

        @Override
        public void returnBook(int bookId) {

        }

        @Override
        public void search(String searchField, String searchString) {

        }
    }

    class Admin extends User implements AdminTransactions {
        public Admin(int userID, String name) {
            super(userID, name);
        }

        @Override
        public void addBook(String Title, String Author) {

        }

        @Override
        public void removeBook(int bookId) {

        }

        @Override
        public void addMember(String memberName) {

        }

        @Override
        public void removeMember(int memberId) {

        }

        @Override
        public void search(String searchField, String searchString) {

        }
    }
}
