package lab1.eight_task;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int randNumber = rand.nextInt(151) + 5;

        System.out.println("Случайно число: " + randNumber);

        if (randNumber > 25 && randNumber < 100) {
            System.out.println(randNumber + " попадает в интервал (25; 100).");
        } else {
            System.out.println(randNumber + " не попадает в интервал (25; 100).");
        }
    }
}
