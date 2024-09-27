/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * AdminController.java
 * Sept 7, 2024
 */

package AdaptiveLibraryManagementSystem;

public class AdminCommander {
    private final AdministratorInterface adminInterface = new AdministratorInterface();

    public AdminCommander(String command) {
        execute(command);
    }

    private void execute(String command) {
        switch (command) {
            case "addBook":
                adminInterface.addBook();
                break;
            case "removeBook":
                adminInterface.removeBook();
                break;
            case "listBooks":
                adminInterface.listBooks();
                break;
            case "addMember":
                adminInterface.addMember();
                break;
            case "removeMember":
                adminInterface.removeMember();
                break;
            case "listMembers":
                adminInterface.listMembers();
                break;
            case "loanBook":
                adminInterface.borrowBook();
                break;
            case "checkInBook":
                adminInterface.returnBook();
                break;
            case "listLoans":
                adminInterface.listLoans();
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
