package lab2.task5;

public class Converter {
    public static void main(String[] args) {
        Double doubleObject1 = Double.valueOf("3.14");
        Double doubleObject2 = Double.valueOf(5.67);

        System.out.println("Объект doubleObject1: " + doubleObject1);
        System.out.println("Объект doubleObject2: " + doubleObject2);

        String doubleString = "2.718";
        double primitiveDouble = Double.parseDouble(doubleString);
        System.out.println("Примитивный тип double, полученный из строки: " + primitiveDouble);

        double dValue = doubleObject1; // преобразование Double в double
        float fValue = doubleObject1.floatValue(); // преобразование Double в float
        long lValue = doubleObject1.longValue(); // преобразование Double в long
        int iValue = doubleObject1.intValue(); // преобразование Double в int

        System.out.println("Примитивный тип double: " + dValue);
        System.out.println("Примитивный тип float: " + fValue);
        System.out.println("Примитивный тип long: " + lValue);
        System.out.println("Примитивный тип int: " + iValue);

        String stringValue = Double.toString(3.14);
        System.out.println("Строковое представление числа 3.14: " + stringValue);
    }
}
