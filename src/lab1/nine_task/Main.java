package lab1.nine_task;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int n = rand.nextInt(28801);

        System.out.println("Осталось секунд: " + n);

        int hours = n / 3600;
        int minutes = (n % 3600) / 60;

        if (hours > 0) {
            if (hours > 1) {
                System.out.print("Осталось " + hours + " часа");
            } else {
                System.out.print("Остался 1 час");
            }

            if (minutes > 0) {
                System.out.println(" и " + minutes + " минут");
            } else {
                System.out.println();
            }
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}