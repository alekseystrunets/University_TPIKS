package lab3.task2;

public class Lorry extends Car {
    private double loadCapacity;

    public Lorry(String brand, String carClass, double weight, Driver driver, Engine engine, double loadCapacity) {
        super(brand, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLorry Load Capacity: " + loadCapacity + " tons";
    }
}
