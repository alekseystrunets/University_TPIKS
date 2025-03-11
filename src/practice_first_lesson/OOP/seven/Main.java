package practice_first_lesson.OOP.seven;

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student(1, "Иванов Иван");

        ivanov.info();

        int[] ivanovGrades = {5, 4, 3, 5, 4};

        double ivanovAverage = ivanov.calculateAverageGrade(ivanovGrades);
        System.out.println("Средний балл студента " + ivanov.nameStudent + ": " + ivanovAverage);

        Student petrov = new Student(2, "Петров Петр");

        petrov.info();

        int[] petrovGrades = {3, 3, 4, 2, 5};

        double petrovAverage = petrov.calculateAverageGrade(petrovGrades);
        System.out.println("Средний балл студента " + petrov.nameStudent + ": " + petrovAverage);
    }
}
