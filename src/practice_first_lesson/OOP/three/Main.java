package practice_first_lesson.OOP.three;

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.numberCourse = 1;
        ivanov.nameStudent = "Иванов Димон";

        Student petrov = new Student();
        petrov.numberCourse = 2;
        petrov.nameStudent = "Петров Тереник";

        System.out.println("Данные Иванова:");
        ivanov.info();

        System.out.println("Данные Петрова:");
        petrov.info();
    }
}
