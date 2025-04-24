package practice3.task2;

import java.util.LinkedList;

class CustomQueue<T> {
    private LinkedList<T> queue;
    private int capacity;

    public CustomQueue(int capacity) {
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public void set(T item) throws IllegalStateException {
        if (queue.size() >= capacity) {
            throw new IllegalStateException("Очередь переполнена");
        }
        queue.add(item);
    }

    public T get() throws IllegalStateException {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}


