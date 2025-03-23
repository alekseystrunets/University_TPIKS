package lab4.task6;

public class Printer implements Runnable {

    /**
     * Переопределенный метод run(), который выполняется при запуске потока.
     */
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Поток был прерван: " + e.getMessage());
                }
            }
        }
    }
}