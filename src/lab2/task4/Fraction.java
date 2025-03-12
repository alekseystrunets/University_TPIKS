package lab2.task4;

import java.util.Scanner;

public class Fraction {
    private int num;
    private int denom;

    public Fraction() {
        this.num = 0;
        this.denom = 1;
    }

    public Fraction(int num, int denom) {
        if (denom == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0.");
        }
        this.num = num;
        this.denom = denom;
        reduce(); // Сокращаем дробь при создании
    }

    private void reduce() {
        int gcd = gcd(num, denom);
        num /= gcd;
        denom /= gcd;
    }

    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    public static Fraction add(Fraction... fractions) {
        int numeratorSum = 0;
        int commonDenominator = 1;

        for (Fraction fraction : fractions) {
            commonDenominator *= fraction.denom;
        }

        for (Fraction fraction : fractions) {
            numeratorSum += fraction.num * (commonDenominator / fraction.denom);
        }

        return new Fraction(numeratorSum, commonDenominator);
    }

    public static Fraction subtract(Fraction a, Fraction b) {
        return add(a, new Fraction(-b.num, b.denom));
    }

    public static Fraction multiply(Fraction... fractions) {
        int numeratorProduct = 1;
        int denominatorProduct = 1;

        for (Fraction fraction : fractions) {
            numeratorProduct *= fraction.num;
            denominatorProduct *= fraction.denom;
        }

        return new Fraction(numeratorProduct, denominatorProduct);
    }

    public static Fraction divide(Fraction a, Fraction b) {
        return multiply(a, new Fraction(b.denom, b.num));
    }

    @Override
    public String toString() {
        return num + "/" + denom;
    }

    public static void modifyEvenIndexFractions(Fraction[] fractions) {
        for (int i = 0; i < fractions.length - 1; i += 2) {
            fractions[i] = add(fractions[i], fractions[i + 1]);
        }
    }

}
