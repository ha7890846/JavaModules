class UserDataManager {
    private String username;
    private String password;

    public UserDataManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void registerUser() {
        // Validate username and password
        if (validateUsername(username) && validatePassword(password)) {
            // Register user in the database
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void loginUser() {
        // Validate username and password
        if (validateUsername(username) && validatePassword(password)) {
            // Authenticate user
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private boolean validateUsername(String username) {
        // Validate username (e.g., length, characters allowed)
        return username.length() >= 5 && username.matches("[a-zA-Z_0-9]+");
    }

    private boolean validatePassword(String password) {
        // Validate password (e.g., length, complexity)
        return password.length() >= 8 && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    }
}
class UserRegistration {
    public static boolean registerUser(String username, String password) {
        if (UserValidator.validateUsername(username) && UserValidator.validatePassword(password)) {
            // Register user in the database (simulated)
            System.out.println("User registered successfully.");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}
class UserAuthenticator {
    public static boolean authenticateUser(String username, String password) {
        return UserValidator.validateUsername(username) && UserValidator.validatePassword(password);
    }
}
class UserValidator {
    public static boolean validateUsername(String username) {
        // Validate username (e.g., length, characters allowed)
        return username.length() >= 5 && username.matches("[a-zA-Z_0-9]+");
    }

    public static boolean validatePassword(String password) {
        // Validate password (e.g., length, complexity)
        return password.length() >= 8 && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    }
}
public class UserManagerApp {
    public static void main(String[] args) {
        String username = "john_doe";
        String password = "Password123";

        if (UserRegistration.registerUser(username, password)) {
            System.out.println("User registered Main successfully.");
        } else {
            System.out.println("User registration Main failed.");
        }

        // Separate login functionality
        if (UserAuthenticator.authenticateUser(username, password)) {
            System.out.println("User logged in sub successfully.");
        } else {
            System.out.println("Invalid username sub or password.");
        }
    }
}