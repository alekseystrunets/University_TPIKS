package lab2.task4;

import java.util.Scanner;

import static lab2.task4.Fraction.modifyEvenIndexFractions;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дробей: ");
        int k = scanner.nextInt();
        Fraction[] fractions = new Fraction[k];

        for (int i = 0; i < k; i++) {
            System.out.print("Введите числитель дроби " + (i + 1) + ": ");
            int numerator = scanner.nextInt();
            System.out.print("Введите знаменатель дроби " + (i + 1) + ": ");
            int denominator = scanner.nextInt();
            fractions[i] = new Fraction(numerator, denominator);
        }

        System.out.println("Введенные дроби:");
        for (Fraction fraction : fractions) {
            System.out.println(fraction);
        }

        // Изменение дробей с четными индексами
        modifyEvenIndexFractions(fractions);

        System.out.println("Дроби после изменения:");
        for (Fraction fraction : fractions) {
            System.out.println(fraction);
        }
    }
}
