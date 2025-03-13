package lab3.task3;

class Pear extends Fruit {
    private final double pricePerKg = 2.5;

    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double getCost() {
        return weight * pricePerKg;
    }

    @Override
    public String toString() {
        return "Pear, Weight: " + weight + "kg, Cost: " + getCost() + " BYN";
    }
}