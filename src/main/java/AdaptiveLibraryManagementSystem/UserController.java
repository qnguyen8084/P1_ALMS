package AdaptiveLibraryManagementSystem;

class UserController {
    public UserController(String command) {
        Member member = new Member("member");
        switch (command) {
            case "borrowBook":
                member.borrowBook();
                break;
            case "returnBook":
                member.returnBook();
                break;
            case "listBooks":
                member.listBooks();
                break;
            case "exit":
                System.out.println("Thank you for using Adaptive Library Management System!");
                System.exit(0);
            default:
                System.out.println("Unknown command.");
                break;
        }

    }

}
