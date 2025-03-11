package lab1.twelve_task;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> exam = new HashSet<>();
        Random random = new Random();

        while (exam.size() < 15) {
            int a = random.nextInt(8) + 2;
            int b = random.nextInt(8) + 2;
            String example = a + " * " + b;

            if (!exam.contains(example) && !exam.contains(b + " * " + a)) {
                exam.add(example);
            }
        }

        System.out.println("Уникальные примеры из таблицы умножения:");
        for (String example : exam) {
            System.out.println(example);
        }
    }
}
