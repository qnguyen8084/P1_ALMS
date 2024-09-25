package AdaptiveLibraryManagementSystem;

import java.util.Scanner;

public class AdminController{
    UserManager userManager = new UserManager();
    BookManager bookManager = new BookManager();
    Scanner scanner = new Scanner(System.in);
    Admin admin = new Admin("admin");

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
                admin.listUsers();
                break;
            case "exit":
                scanner.close();
                System.out.println("Thank you for using Adaptive Library Management System!");
                System.exit(0);
            default:
                System.out.println("Unknown command.");
                break;
        }
    }

}
