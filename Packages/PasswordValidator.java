interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*()].*");
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        String password1 = "Passw0rd!";
        String password2 = "weakpass";

        System.out.println("Password: " + password1 + " | Strong: " + SecurityUtils.isStrongPassword(password1));
        System.out.println("Password: " + password2 + " | Strong: " + SecurityUtils.isStrongPassword(password2));
    }
}
