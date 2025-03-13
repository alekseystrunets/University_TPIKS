package lab3.task5;

public class Main {
    public static void main(String[] args) {
        String login1 = "user_name1";
        String password1 = "password_1";
        String confirmPassword1 = "password_1";

        String login2 = "user@name";
        String password2 = "pass_";
        String confirmPassword2 = "pass_";

        boolean result1 = Validator.validateUser(login1, password1, confirmPassword1);
        System.out.println("Result for user 1: " + result1);

        boolean result2 = Validator.validateUser(login2, password2, confirmPassword2);
        System.out.println("Result for user 2: " + result2);
    }
}
