package lab2.task1;

public class Circle {
    private double radius;
    private double xCenter;
    private double yCenter;

    public Circle() {
        this.radius = 1.0;
        this.xCenter = 0.0;
        this.yCenter = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.xCenter = 0.0;
        this.yCenter = 0.0;
    }

    public Circle(double xCenter, double yCenter) {
        this.radius = 1.0;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public Circle(double radius, double xCenter, double yCenter) {
        this.radius = radius;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public void displayInfo() {
        System.out.println("Радиус: " + radius);
        System.out.println("Координаты центра: (" + xCenter + ", " + yCenter + ")");
        System.out.println("Площадь: " + area());
        System.out.println("Длина окружности: " + circumference());
    }

    public void moveCenter(double dx, double dy) {
        xCenter += dx;
        yCenter += dy;
    }

    public void changeRadius(double newRadius) {
        if (newRadius > 0) {
            radius = newRadius;
        } else {
            System.out.println("Радиус не может быть отрицательным числом");
        }
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

}
