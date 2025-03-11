package practice_first_lesson.OOP.ten;

class Student {
    int numberCourse;
    String nameStudent;

    public Student() {
        this.numberCourse = 1;
        this.nameStudent = "Неизвестный студент";
    }

    public Student(String nameStudent) {
        this.numberCourse = 1;
        this.nameStudent = nameStudent;
    }

    public Student(int numberCourse, String nameStudent) {
        this.numberCourse = numberCourse;
        this.nameStudent = nameStudent;
    }

    public Student(Student other) {
        this.numberCourse = other.numberCourse;
        this.nameStudent = other.nameStudent;
    }

    void info() {
        System.out.println("Имя студента: " + nameStudent + ", Номер курса: " + numberCourse);
    }
}
