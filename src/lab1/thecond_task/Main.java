package lab1.thecond_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int CORRECT_PASSWORD = 1234;

        Scanner scanner = new Scanner(System.in);

        int userInput;
        do {
            System.out.print("Введите четырехзначный пароль: ");
            userInput = scanner.nextInt();

            if (userInput != CORRECT_PASSWORD) {
                System.out.println("Неверный пароль.");
            }
        } while (userInput != CORRECT_PASSWORD);

        System.out.println("Доступ разрешен!");

        scanner.close();
    }
}
