package practice_first_lesson.OOP.nine;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.info();

        Student student2 = new Student("Иванов ДИМОС");
        student2.info();

        Student student3 = new Student(2, "Петров КИРИЛЛ");
        student3.info();
    }
}
