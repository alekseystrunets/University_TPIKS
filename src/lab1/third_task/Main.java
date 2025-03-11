package lab1.third_task;

public class Main {
    public static void main(String[] args) {
        long sum = 0;

        for (int n = 1; n <= 4; n++) {
            int min = (int) Math.pow(10, n - 1);
            int max = (int) Math.pow(10, n) - 1;

            for (int i = min; i <= max; i++) {
                sum += i;
            }
        }

        System.out.println("Сумма всех n-значных чисел (1 ≤ n ≤ 4): " + sum);
    }
}
