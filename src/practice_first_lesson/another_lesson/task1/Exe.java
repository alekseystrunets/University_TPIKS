package practice_first_lesson.another_lesson.task1;


public class Exe {

    public static void print(int... numbers) {
        System.out.println("Параметры:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


    public static int product(int... numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }


    public static int[] sort(int... numbers) {
        int n = numbers.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (numbers[i - 1] > numbers[i]) {
                    int temp = numbers[i - 1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        return numbers;
    }
}
