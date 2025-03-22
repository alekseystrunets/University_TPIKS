package lab4.task2;

public class Main {
    public static void main(String[] args) {
        Numbers store = new Numbers();

        store.addNumber(10);
        store.addNumber(5);
        store.addNumber(15);
        store.addNumber(20);

        store.displayNumbers();

        store.removeNumber(15);
        store.displayNumbers();

        System.out.println("Наиболее близкое число к 12: " + store.findClosestNumber(12));
        System.out.println("Наиболее близкое число к 7: " + store.findClosestNumber(7));
        System.out.println("Наиболее близкое число к 3: " + store.findClosestNumber(3));
    }
}
