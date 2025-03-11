package practice_first_lesson;

import java.util.Scanner;

public class ScannerPr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello, enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, my name is " + name);
    }
}
