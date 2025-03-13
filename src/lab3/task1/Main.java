package lab3.task1;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Ivan", "Petrov", "CS101", 7.5);
        students[1] = new Student("Olga", "Ivanova", "CS101", 8);
        students[2] = new Magistracy("Petr", "Sidorov", "CSM1", 7.8);
        students[3] = new Magistracy("Anna", "Kovaleva", "CSM1", 8);
        students[4] = new Student("Dmitry", "Smirnov", "CS102", 6.9);

        for (Student student : students) {
            System.out.println(student + " gets scholarship: " + student.getScholarship());
        }
    }
}
