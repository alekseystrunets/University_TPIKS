package lab3.task3;

class Apple extends Fruit {
    private final double pricePerKg = 3.0;

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public double getCost() {
        return weight * pricePerKg;
    }

    @Override
    public String toString() {
        return "Apple, Weight: " + weight + "kg, Cost: " + getCost() + " BYN";
    }
}
