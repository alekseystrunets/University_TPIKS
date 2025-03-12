package lab2.task1;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.displayInfo();

        Circle circle2 = new Circle(5);
        circle2.displayInfo();

        Circle circle3 = new Circle(3, 2, 3);
        circle3.displayInfo();

        circle3.moveCenter(1, -1);
        System.out.println("После перемещения центра:");
        circle3.displayInfo();

        circle3.changeRadius(4);
        System.out.println("После изменения радиуса:");
        circle3.displayInfo();
    }
}
