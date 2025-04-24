package practice3.task2;

public class Main {
    public static void main(String[] args) {
        CustomQueue<Object> queue = new CustomQueue<>(5);

        try {
            queue.set("Hello");
            queue.set(42);
            queue.set(3.14);
            queue.set(true);
            queue.set(new int[]{1, 2, 3}); // Массив как объект

            // Извлечение элементов
            while (!queue.isEmpty()) {
                System.out.println(queue.get());
            }

            // Попытка извлечь элемент из пустой очереди
            queue.get();
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
    }
}
