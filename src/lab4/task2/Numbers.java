package lab4.task2;

import java.util.TreeSet;

public class Numbers {
    private TreeSet<Integer> numbers;

    public Numbers() {
        numbers = new TreeSet<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void removeNumber(int number) {
        numbers.remove(number);
    }

    public Integer findClosestNumber(int target) {
        if (numbers.isEmpty()) {
            return null;
        }

        Integer floor = numbers.floor(target);
        Integer ceiling = numbers.ceiling(target);

        if (floor == null) {
            return ceiling;
        }
        if (ceiling == null) {
            return floor;
        }

        if (Math.abs(target - floor) <= Math.abs(target - ceiling)) {
            return floor;
        } else {
            return ceiling;
        }
    }

    public void displayNumbers() {
        System.out.println("Содержимое NumberStore: " + numbers);
    }
}
