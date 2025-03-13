package lab3.task5;

public class Validator {
    public static boolean validateUser(String login, String password, String confirmPassword) {
        try {
            if (!isValidLogin(login)) {
                throw new MyException("Login must contain only Latin letters, digits, and underscores, and be less than 20 characters.");
            }

            if (!isValidPassword(password)) {
                throw new WrongPasswordException("Password must contain only Latin letters, digits, and underscores, and be less than 20 characters.");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password and confirm password do not match.");
            }

            return true;
        } catch (MyException | WrongPasswordException e) {
            System.out.println("Validation failed: " + e.getMessage());
            return false;
        }
    }

    private static boolean isValidLogin(String login) {
        return login.matches("[a-zA-Z0-9_]{1,19}");
    }

    private static boolean isValidPassword(String password) {
        return password.matches("[a-zA-Z0-9_]{1,19}");
    }
}
