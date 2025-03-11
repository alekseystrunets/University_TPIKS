package lab1.eleven_task;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Введите натуральное число больше 3: ");
            n = scan.nextInt();
            if (n > 3) {
                break;
            } else {
                System.out.println("Ошибка: число должно быть больше 3. Попробуйте снова.");
            }
        }

        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n + 1);
        }

        System.out.print("Первый массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        ArrayList<Integer> evenNum = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNum.add(num); // Добавляем четное число в список
            }
        }

        // Вывод второго массива, если он не пуст
        if (evenNum.size() > 0) {
            System.out.print("Второй массив (четные элементы): ");
            for (int evenNumb : evenNum) {
                System.out.print(evenNum + " ");
            }
            System.out.println();
        } else {
            System.out.println("Второй массив пуст (нет четных элементов).");
        }

        scan.close(); // Закрываем сканер
    }
}
