package practice_first_lesson.OOP.thecond;

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.numberCourse = 1;
        ivanov.nameStudent = "Иванов Иван";

        Student petrov = ivanov;

        System.out.println("Данные ivanov: Имя студента: " + ivanov.nameStudent + ", Номер курса: " + ivanov.numberCourse);
        System.out.println("Данные petrov: Имя студента: " + petrov.nameStudent + ", Номер курса: " + petrov.numberCourse);

        ivanov.numberCourse = 2;
        ivanov.nameStudent = "Петров Петр";

        System.out.println("После изменения:");
        System.out.println("Данные ivanov: Имя студента: " + ivanov.nameStudent + ", Номер курса: " + ivanov.numberCourse);
        System.out.println("Данные petrov: Имя студента: " + petrov.nameStudent + ", Номер курса: " + petrov.numberCourse);
    }
}
