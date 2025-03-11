package practice_first_lesson.Operators;

public class ThirdTask {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = -20; i <= 20; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Сумма всех четных чисел от -20 до 20: " + sum);
    }
}
