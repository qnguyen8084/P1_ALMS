package AdaptiveLibraryManagementSystem;

public class AdminController {
    ConsoleInterface admin = new ConsoleInterface();
    public AdminController(String command) {
        switch (command) {
            case "addBook":
                admin.addBook();
                break;
            case "removeBook":
                admin.removeBook();
                break;
            case "listBooks":
                admin.listBooks();
                break;
            case "addMember":
                admin.addMember();
                break;
            case "removeMember":
                admin.removeMember();
                break;
            case "listMembers":
                admin.listMembers();
                break;
            case "loanBook":
                admin.borrowBook();
                break;
            case "checkInBook":
                admin.returnBook();
                break;
            case "listLoans":
                admin.listLoans();
                break;
            case "search":
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
