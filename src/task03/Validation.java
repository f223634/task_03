package task03;
// all validation logic
public class Validation {

    public boolean validateUser(String username, String password) throws Exception {
        // Check if the username is at least 5 characters long
        if (username == null || username.length() < 5) {
            throw new Exception("Username must be at least 5 characters long.");
        }

        // Check if the password contains at least one special character
        if (!password.matches(".*[!@#$%^&*()].*")) {
            throw new Exception("Password must contain at least one special character.");
        }

        // If both validations pass, return true
        return true;
    }

    public static void main(String[] args) {
        Validation userService = new Validation();

        try {
            boolean isValid = userService.validateUser("user123", "Password!");
            System.out.println("User is valid: " + isValid);
        } catch (Exception e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}

