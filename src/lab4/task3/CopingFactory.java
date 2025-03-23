package lab4.task3;

import java.io.*;

/**
 * Класс для копирования содержимого из одного файла в другой.
 * Использует BufferedReader и BufferedWriter для эффективного чтения и записи.
 */
public class CopingFactory {

    /**
     * Копирует содержимое из исходного файла в целевой файл.
     *
     * @param sourceFilePath путь к исходному файлу
     * @param targetFilePath путь к целевому файлу
     * @throws IOException если происходит ошибка ввода-вывода при чтении или записи файлов
     */
    public static void copyFile(String sourceFilePath, String targetFilePath) throws IOException {
        File sourceFile = new File(sourceFilePath);
        if (!sourceFile.exists()) {
            throw new FileNotFoundException("Исходный файл не найден: " + sourceFilePath);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Файл успешно скопирован из " + sourceFilePath + " в " + targetFilePath);
        }
    }
}