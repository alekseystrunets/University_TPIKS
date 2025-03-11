package practice_first_lesson.arrays;
import java.util.Random;

import java.util.Random;

public class FirstTask {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[7][4];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = rand.nextInt(11) - 5;
            }
        }

        System.out.println("Сгенерированный массив:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int maxProductIndex = -1;
        int maxProduct = 0;

        for (int i = 0; i < 7; i++) {
            int product = 1;
            for (int j = 0; j < 4; j++) {
                product *= array[i][j];
            }
            if (Math.abs(product) > Math.abs(maxProduct)) {
                maxProduct = product;
                maxProductIndex = i;
            }
        }

        System.out.println("Индекс строки с наибольшим по модулю произведением: " + maxProductIndex);
    }
}
