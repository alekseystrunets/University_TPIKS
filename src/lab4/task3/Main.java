package lab4.task3;

import java.io.IOException;

import static lab4.task3.CopingFactory.copyFile;

/**
 * Класс Main запускает программу по копированию содержимого одного файла в другой.
 */
public class Main {
    /**
     * Основной метод для демонстрации работы класса.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        String sourceFilePath = "first.txt";
        String targetFilePath = "thecond.txt";

        try {
            copyFile(sourceFilePath, targetFilePath);
        } catch (IOException e) {
            System.err.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }
}