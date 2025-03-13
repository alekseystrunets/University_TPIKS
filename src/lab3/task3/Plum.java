package lab3.task3;

class Plum extends Fruit {
    private final double pricePerKg = 4.0;

    public Plum(double weight) {
        super(weight);
    }

    @Override
    public double getCost() {
        return weight * pricePerKg;
    }

    @Override
    public String toString() {
        return "Plum, Weight: " + weight + "kg, Cost: " + getCost() + " BYN";
    }
}
