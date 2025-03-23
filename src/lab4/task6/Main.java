package lab4.task6;

public class Main {
    /**
     * Основной метод для создания и запуска потоков.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Printer(), "Поток 1");
        Thread thread2 = new Thread(new Printer(), "Поток 2");
        Thread thread3 = new Thread(new Printer(), "Поток 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
