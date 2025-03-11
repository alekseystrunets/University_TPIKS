package practice_first_lesson.OOP.eight;

class Calculator {
    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }

    public double calculateAr(double length, double width) {
        return length * width;
    }
}

