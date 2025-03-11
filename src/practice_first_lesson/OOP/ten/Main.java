package practice_first_lesson.OOP.ten;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(2, "Петров Петр");
        student1.info();

        Student student2 = new Student(student1);
        student2.info();
    }
}
