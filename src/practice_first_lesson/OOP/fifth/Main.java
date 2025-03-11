package practice_first_lesson.OOP.fifth;

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.numberCourse = 1;
        ivanov.nameStudent = "Иванов ДИМСАС";

        int[] ivanovGrades = {5, 4, 3, 5, 4};

        ivanov.info();
        double ivanovAverage = ivanov.calculateAv(ivanovGrades);
        System.out.println("Средний балл студента " + ivanov.nameStudent + ": " + ivanovAverage);

        Student petrov = new Student();
        petrov.numberCourse = 2;
        petrov.nameStudent = "Петров ПЕТРО";

        int[] petrovGrades = {3, 3, 4, 2, 5};

        petrov.info();
        double petrovAverage = petrov.calculateAv(petrovGrades);
        System.out.println("Средний балл студента " + petrov.nameStudent + ": " + petrovAverage);
    }
}
