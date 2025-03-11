package practice_first_lesson.OOP.seven;
class Student {
    int numberCourse;
    String nameStudent;

    public Student(int numberCourse, String nameStudent) {
        this.numberCourse = numberCourse;
        this.nameStudent = nameStudent;
    }
    void info() {
        System.out.println("Имя студента: " + nameStudent + ", Номер курса: " + numberCourse);
    }

    double calculateAverageGrade(int[] grades) {
        if (grades == null || grades.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}
