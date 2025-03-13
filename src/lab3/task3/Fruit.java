package lab3.task3;

abstract class Fruit {
    protected double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public void printManufacturerInfo() {
        System.out.print("Made in RB");
    }

    public abstract double getCost();
}
