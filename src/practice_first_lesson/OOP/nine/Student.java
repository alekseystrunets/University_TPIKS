package practice_first_lesson.OOP.nine;

class Student {
    int numberCourse;
    String nameStudent;

    public Student() {
        this.numberCourse = 1;
        this.nameStudent = "Ничего";
    }

    public Student(String nameStudent) {
        this.numberCourse = 1;
        this.nameStudent = nameStudent;
    }


    public Student(int numberCourse, String nameStudent) {
        this.numberCourse = numberCourse;
        this.nameStudent = nameStudent;
    }

    void info() {
        System.out.println("Имя студента: " + nameStudent + ", Номер курса: " + numberCourse);
    }
}
