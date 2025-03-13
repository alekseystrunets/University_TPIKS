package lab3.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Fruit> fruits = new ArrayList<>();

        fruits.add(new Apple(1.5));
        fruits.add(new Pear(2.0));
        fruits.add(new Plum(1.0));
        fruits.add(new Apple(0.5));
        fruits.add(new Pear(1.2));
        fruits.add(new Plum(2.5));


        double totalCost = 0;
        double totalAppleCost = 0;
        double totalPearCost = 0;
        double totalPlumCost = 0;

        for (Fruit fruit : fruits) {
            totalCost += fruit.getCost();
            if (fruit instanceof Apple) {
                totalAppleCost += fruit.getCost();
            } else if (fruit instanceof Pear) {
                totalPearCost += fruit.getCost();
            } else if (fruit instanceof Plum) {
                totalPlumCost += fruit.getCost();
            }
        }
        System.out.println("Total cost of all fruits: " + totalCost + " BYN");
        System.out.println("Total cost of apples: " + totalAppleCost + " BYN");
        System.out.println("Total cost of pears: " + totalPearCost + " BYN");
        System.out.println("Total cost of plums: " + totalPlumCost + " BYN");
    }
}
