package practice_first_lesson.OOP.six;

class Student {
    int numberCourse;
    String nameStudent;

    public Student() {
        this.numberCourse = 1;
        this.nameStudent = "Ничего";
    }

    void info() {
        System.out.println("Имя студента: " + nameStudent + ", Номер курса: " + numberCourse);
    }

    double calculateAv(int[] grades) {
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
