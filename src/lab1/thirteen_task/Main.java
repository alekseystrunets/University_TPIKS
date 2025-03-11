package lab1.thirteen_task;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = 5;
        int M = 4;
        int[][] matrix = new int[N][M];
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = rand.nextInt(100) + 1;
            }
        }

        System.out.println("Начальная матрица:");
        printMatrix(matrix);

        for (int i = 0; i < N; i++) {
            int maxIndex = 0;
            int minIndex = 0;

            for (int j = 0; j < M; j++) {
                if (matrix[i][j] > matrix[i][maxIndex]) {
                    maxIndex = j;
                }
                if (matrix[i][j] < matrix[i][minIndex]) {
                    minIndex = j;
                }
            }

            if (maxIndex != 0) {
                int temp = matrix[i][0];
                matrix[i][0] = matrix[i][maxIndex];
                matrix[i][maxIndex] = temp;
            }

            if (minIndex != M - 1) {
                int temp = matrix[i][M - 1];
                matrix[i][M - 1] = matrix[i][minIndex];
                matrix[i][minIndex] = temp;
            }
        }

        System.out.println("Измененная матрица:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
