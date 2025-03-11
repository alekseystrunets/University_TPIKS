package lab1.six_task;

public class Main {
    public static void main(String[] args) {
        int n = 11;
        int[] fib = new int[n];

        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Первые 11 членов последовательности Фибоначчи:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
