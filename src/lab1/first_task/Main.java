package lab1.first_task;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        System.out.println(n + " в степени 1 = " + n);
        System.out.println(n + " в степени 2 = " + (n * n));
        System.out.println(n + " в степени 3 = " + (n * n * n));
        System.out.println(n + " в степени 4 = " + (n * n * n * n));

        scanner.close();
    }
}