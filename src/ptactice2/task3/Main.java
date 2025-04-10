package ptactice2.task3;

public class Main {
    public static boolean validateCredentials(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания, и быть меньше 20 символов.");
            }

            if (!password.matches("[a-zA-Z0-9_]+") || password.length() >= 20) {
                throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания, и быть меньше 20 символов.");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }

            return true;
        } catch (WrongLoginException e) {
            System.out.println("Ошибка логина: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка пароля: " + e.getMessage());
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(validateCredentials("valid_login", "valid_password", "valid_password"));
        System.out.println(validateCredentials("invalid-login!", "valid_password", "valid_password"));
        System.out.println(validateCredentials("valid_login", "invalid-password!", "invalid-password!"));
        System.out.println(validateCredentials("valid_login", "valid_password", "wrong_password"));
    }
}
