package lab1.fourth_task;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;

        System.out.println("Я загадал число от 1 до 10.");

        while (userGuess != numberToGuess) {
            System.out.print("Введите число: ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Загаданное число больше.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Поздравляю! ");
            }
        }

        scanner.close();
    }
}
