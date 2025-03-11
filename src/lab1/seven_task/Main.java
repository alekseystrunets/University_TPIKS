package lab1.seven_task;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int allTickets = 999999;
        System.out.println("Всего билетов: " + allTickets);

        for (int i = 1; i <= 999999; i++) {
            String tick = String.format("%06d", i);

            int firstHl = Character.getNumericValue(tick.charAt(0)) +
                    Character.getNumericValue(tick.charAt(1)) +
                    Character.getNumericValue(tick.charAt(2));

            int secondHl = Character.getNumericValue(tick.charAt(3)) +
                    Character.getNumericValue(tick.charAt(4)) +
                    Character.getNumericValue(tick.charAt(5));

            if (firstHl == secondHl) {
                count++;
            }
        }

        System.out.println("Количество счастливых билетов: " + count);
    }
}
