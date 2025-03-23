package lab4.task7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Peoples {

    private static final int NUM_PHILOSOPHERS = 5;

    private static Lock[] forks = new ReentrantLock[NUM_PHILOSOPHERS];

    private static Thread[] peoples = new Thread[NUM_PHILOSOPHERS];

    public static void main(String[] args) {

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new ReentrantLock();
        }

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            final int philosopherId = i;
            peoples[i] = new Thread(() -> {
                try {
                    philosopherLife(philosopherId);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Человек " + philosopherId + " был прерван.");
                }
            });
            peoples[i].start();
        }
    }

    /**
     * Жизнь человека: думать, брать вилки, есть, класть вилки.
     *
     * @param peoplesId идентификатор человека
     */
    private static void philosopherLife(int peoplesId) throws InterruptedException {
        while (true) {

            System.out.println("Человек " + peoplesId + " думает.");
            Thread.sleep(1000);

            int leftFork = peoplesId;
            int rightFork = (peoplesId + 1) % NUM_PHILOSOPHERS;

            if (leftFork < rightFork) {
                forks[leftFork].lock();
                forks[rightFork].lock();
            } else {
                forks[rightFork].lock();
                forks[leftFork].lock();
            }

            try {
                System.out.println("Человек " + peoplesId + " ест.");
                Thread.sleep(1000);
            } finally {
                forks[leftFork].unlock();
                forks[rightFork].unlock();
                System.out.println("Человек " + peoplesId + " кладет вилки и продолжает думать.");
            }
        }
    }
}