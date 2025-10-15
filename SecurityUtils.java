interface Security_Utils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*()].*");
    }
}

public class SecurityUtils {
    public static void main(String[] args) {
        String password = "Insure@123";
        if (Security_Utils.isStrongPassword(password)) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
    }
}
