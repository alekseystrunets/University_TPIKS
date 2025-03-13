package practice_first_lesson.OOP.twelve;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 3);
        m1.setValue(0, 0, 1.0);
        m1.setValue(0, 1, 2.0);
        m1.setValue(0, 2, 3.0);
        m1.setValue(1, 0, 4.0);
        m1.setValue(1, 1, 5.0);
        m1.setValue(1, 2, 6.0);

        Matrix m2 = new Matrix(2, 3);
        m2.setValue(0, 0, 7.0);
        m2.setValue(0, 1, 8.0);
        m2.setValue(0, 2, 9.0);
        m2.setValue(1, 0, 10.0);
        m2.setValue(1, 1, 11.0);
        m2.setValue(1, 2, 12.0);

        System.out.println("Матрица m1:");
        m1.print();

        System.out.println("Матрица m2:");
        m2.print();


        Matrix sum = m1.add(m2);
        System.out.println("Сумма матриц m1 и m2:");
        sum.print();

        Matrix difference = m1.subtract(m2);
        System.out.println("Разность матриц m1 и m2:");
        difference.print();

        Matrix m3 = new Matrix(3, 2);
        m3.setValue(0, 0, 1.0);
        m3.setValue(0, 1, 2.0);
        m3.setValue(1, 0, 3.0);
        m3.setValue(1, 1, 4.0);
        m3.setValue(2, 0, 5.0);
        m3.setValue(2, 1, 6.0);

        System.out.println("Матрица m3:");
        m3.print();
        Matrix product = m1.multiply(m3); // Пример умножения матриц
        System.out.println("Произведение матриц m1 и m3:");
        product.print();
    }
}
