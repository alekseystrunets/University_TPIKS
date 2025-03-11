package practice_first_lesson;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введие число с ненулевой дробью: ");
        double n = scan.nextDouble();

        long roundValue;
        if (n >= 0) {
            roundValue = (long) (n + 0.5);
        } else {
            roundValue = (long) (n - 0.5);
        }
        System.out.println("Округленное число: " + roundValue);
        scan.close();
    }
}
