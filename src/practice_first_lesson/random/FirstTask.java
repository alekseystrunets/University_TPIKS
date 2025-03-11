package practice_first_lesson.random;

import java.util.Random;

public class FirstTask {
    public static void main(String[] args) {
        Random random = new Random();

        double randomNumber = -3 + (3 - (-3)) * random.nextDouble();

        System.out.println(randomNumber);
    }
}