package practice_first_lesson.Operators;

public class ThecondTask {
    public static void main(String[] args) {
        int number = 2;
        int count = 1;

        do {
            System.out.println(number);
            number *= 2;
            count++;
        } while (count <= 10);
    }
}
