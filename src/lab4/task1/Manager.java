package lab4.task1;

import java.util.LinkedList;

public class Manager {

    public static void printStudents(LinkedList<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static LinkedList<Student> union(LinkedList<Student> set1, LinkedList<Student> set2) {
        LinkedList<Student> result = new LinkedList<>(set1);
        for (Student student : set2) {
            if (!result.contains(student)) {
                result.add(student);
            }
        }
        return result;
    }

    public static LinkedList<Student> intersect(LinkedList<Student> set1, LinkedList<Student> set2) {
        LinkedList<Student> result = new LinkedList<>();
        for (Student student : set1) {
            if (set2.contains(student) && !result.contains(student)) {
                result.add(student);
            }
        }
        return result;
    }

    public static void printSet(LinkedList<Student> students) {
        for (Student student : students) {
            System.out.print(student.getName() + " ");
        }
        System.out.println();
    }
}
