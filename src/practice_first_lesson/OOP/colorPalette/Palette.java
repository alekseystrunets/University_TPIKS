package practice_first_lesson.OOP.colorPalette;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Palette {
    private Map<Integer, String> colors; // Хранение цветов с их номерами

    public Palette() {
        colors = new HashMap<>(); // Инициализация HashMap
    }

    // Метод для добавления цвета
    public void addColor(int number, String colorName) {
        colors.put(number, colorName); // Добавление цвета в палитру
    }

    // Метод для вывода всех цветов
    public void displayColors() {
        System.out.println("Список цветов:");
        for (Map.Entry<Integer, String> entry : colors.entrySet()) {
            System.out.println("Номер: " + entry.getKey() + ", Цвет: " + entry.getValue());
        }
    }

    // Метод для получения цвета по номеру
    public void getColorByNumber(int number) {
        if (colors.containsKey(number)) {
            System.out.println("Выбранный цвет: " + colors.get(number));
        } else {
            System.out.println("Цвет с номером " + number + " не найден.");
        }
    }

    public static void main(String[] args) {
        Palette palette = new Palette();
        Scanner scanner = new Scanner(System.in);

        // Добавление некоторых цветов в палитру
        palette.addColor(1, "Красный");
        palette.addColor(2, "Зеленый");
        palette.addColor(3, "Синий");

        // Отображение всех цветов
        palette.displayColors();

        // Получение цвета по номеру
        System.out.print("Введите номер цвета для получения: ");
        int number = scanner.nextInt();
        palette.getColorByNumber(number);

        scanner.close();
    }
}
