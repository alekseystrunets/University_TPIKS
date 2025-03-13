package lab3.task2;

public class SportCar extends Car {
    private double topSpeed;

    public SportCar(String brand, String carClass, double weight, Driver driver, Engine engine, double topSpeed) {
        super(brand, carClass, weight, driver, engine);
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSport Car Top Speed: " + topSpeed + " km/h";
    }
}
