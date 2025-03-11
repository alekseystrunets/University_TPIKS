package lab1.ten_task;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[12];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(31) - 15;
        }

        System.out.print("Массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int max = arr[0];
        int lastIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                lastIndex = i;
            } else if (arr[i] == max) {
                lastIndex = i;
            }
        }

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Индекс последнего вхождения: " + lastIndex);
    }
}
