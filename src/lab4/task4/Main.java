package lab4.task4;

import static lab4.task4.Serializator.deserializeHorse;
import static lab4.task4.Serializator.serializeHorse;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("Spirit", "Mustang");
        String filename = "horse.ser";

        serializeHorse(horse, filename);
        System.out.println("Horse serialized.");

        Horse deserializedHorse = deserializeHorse(filename);
        System.out.println("Horse deserialized: " + deserializedHorse.getName() + ", Breed: " + deserializedHorse.getBreed());
        System.out.println("Current directory: " + System.getProperty("user.dir"));
    }
}
