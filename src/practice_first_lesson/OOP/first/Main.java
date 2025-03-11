package practice_first_lesson.OOP.first;

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.numberCourse = 1;
        ivanov.nameStudent = "Иванов ЕНИСЕЙ";

        System.out.println("Имя студента: " + ivanov.nameStudent + ", Номер курса: " + ivanov.numberCourse);

        Student petrov = new Student();
        petrov.numberCourse = 2;
        petrov.nameStudent = "Петров ТРУНИЛКА";

        System.out.println("Имя студента: " + petrov.nameStudent + ", Номер курса: " + petrov.numberCourse);
    }
}