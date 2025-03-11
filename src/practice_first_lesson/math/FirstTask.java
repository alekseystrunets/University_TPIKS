package practice_first_lesson.math;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину первого катета (a): ");
        double a = scanner.nextDouble();

        System.out.print("Введите длину второго катета (b): ");
        double b = scanner.nextDouble();

        double area = (a * b) / 2;

        double c = Math.sqrt(a * a + b * b);

        double perimeter = a + b + c;

        System.out.printf("Площадь треугольника: %.2f%n", area);
        System.out.printf("Периметр треугольника: %.2f%n", perimeter);

        scanner.close();
    }
}