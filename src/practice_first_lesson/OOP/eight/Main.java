package practice_first_lesson.OOP.eight;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double squareS = 5.0;
        double squareA = calculator.calculateArea(squareS);
        System.out.println("Площадь квадрата со стороной " + squareS + ": " + squareA);

        int circleR = 3;
        double circleAr = calculator.calculateArea(circleR);
        System.out.println("Площадь круга с радиусом " + circleR + ": " + circleAr);

        double rectangleLength = 4.0;
        double rectangleWidth = 6.0;
        double rectangleArea = calculator.calculateAr(rectangleLength, rectangleWidth);
        System.out.println("Площадь прямоугольника длиной " + rectangleLength + " и шириной " + rectangleWidth + ": " + rectangleArea);
    }
}
