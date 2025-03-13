package lab3.task2;

public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine(150, "Toyota");
        Engine engine2 = new Engine(300, "Ferrari");

        Driver driver1 = new Driver("Ivan Ivanov", 5);
        Driver driver2 = new Driver("Petr Petrov", 3);

        Car car = new Car("Toyota Camry", "Sedan", 1500, driver1, engine1);
        Lorry lorry = new Lorry("MAN", "Truck", 8000, driver2, engine1, 15);
        SportCar sportCar = new SportCar("Ferrari F8", "Sport", 1300, driver2, engine2, 340);

        car.start();
        car.stop();
        System.out.println(car);

        System.out.println();

        lorry.start();
        lorry.turnLeft();
        System.out.println(lorry);

        System.out.println();

        sportCar.start();
        sportCar.turnRight();
        System.out.println(sportCar);
    }
}
