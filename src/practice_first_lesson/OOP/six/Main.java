package practice_first_lesson.OOP.six;

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.nameStudent = "Иванов Иван";
        ivanov.numberCourse = 1;

        ivanov.info();

        int[] ivanovGrades = {5, 4, 3, 5, 4};

        double ivanovAverage = ivanov.calculateAv(ivanovGrades);
        System.out.println("Средний балл студента " + ivanov.nameStudent + ": " + ivanovAverage);

        Student petrov = new Student();
        petrov.nameStudent = "Петров Петр";
        petrov.numberCourse = 2;

        petrov.info();


        int[] petrovGrades = {3, 3, 4, 2, 5};

        double petrovAverage = petrov.calculateAv(petrovGrades);
        System.out.println("Средний балл студента " + petrov.nameStudent + ": " + petrovAverage);
    }
}
