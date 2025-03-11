package practice_first_lesson.math;

import java.util.Scanner;

public class ThecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное положительное число (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Введите положительное число.");
        } else {
            int count = String.valueOf(n).length();

            System.out.println("Количество цифр в числе " + n + ": " + count);
        }

        scanner.close();
    }
}
