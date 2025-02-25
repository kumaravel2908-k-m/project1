import java.util.Scanner;

public class LoginProgram {
    
    // Predefined username and password
    private static String correctUsername = "admin";
    private static String correctPassword = "password123";
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for username and password
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Authenticate user
        if (authenticate(username, password)) {
            System.out.println("Login successful! Welcome, " + username + "!");
        } else {
            System.out.println("Login failed! Invalid username or password.");
        }
        
        scanner.close();
    }
    
    public static boolean authenticate(String username, String password) {
        return username.equals(correctUsername) && password.equals(correctPassword);
    }
}
