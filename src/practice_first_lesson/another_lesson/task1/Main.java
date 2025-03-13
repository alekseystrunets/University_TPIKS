package practice_first_lesson.another_lesson.task1;

public class Main {
    public static void main(String[] args) {
        int[] params = {5, 3, 8, 1, 4};

        Exe.print(params);

        int sum = Exe.sum(params);
        System.out.println("Сумма: " + sum);

        int product = Exe.product(params);
        System.out.println("Произведение: " + product);

        int[] sortedParams = Exe.sort(params);
        System.out.print("Отсортированные параметры: ");
        Exe.print(sortedParams);
    }
}
