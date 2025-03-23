package lab4.task4;

import java.io.*;

public class Serializator {

    public static void serializeHorse(Horse horse, String filename) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream)) {

            oos.writeObject(horse);
            oos.flush();

            byte[] bytes = byteArrayOutputStream.toByteArray();

            System.out.println("Serialized Horse byte values:");
            for (byte b : bytes) {
                System.out.print(b + " ");
            }
            System.out.println();

            try (FileOutputStream fileOutputStream = new FileOutputStream(filename)) {
                fileOutputStream.write(bytes);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Horse deserializeHorse(String filename) {
        Horse horse = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            horse = (Horse) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return horse;
    }
}
