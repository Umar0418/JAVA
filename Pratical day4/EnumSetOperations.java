import java.io.*;
import java.util.*;

// Sample enum for demonstration
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSetOperations {
    public static void main(String[] args) {
        // a) Create an enum set and its complement
        EnumSet<Day> originalSet = EnumSet.of(Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY);
        EnumSet<Day> complementSet = EnumSet.complementOf(originalSet);

        System.out.println("Original EnumSet: " + originalSet);
        System.out.println("Complement EnumSet: " + complementSet);

        // b) Derive sub set and super set from the original set
        EnumSet<Day> subSet = EnumSet.range(Day.MONDAY, Day.WEDNESDAY);
        EnumSet<Day> superSet = EnumSet.allOf(Day.class);

        System.out.println("SubSet: " + subSet);
        System.out.println("SuperSet: " + superSet);

        // c) Create an enum set using enum constants and convert them into an array
        EnumSet<Day> enumSetFromArray = EnumSet.copyOf(Arrays.asList(Day.values()));
        Day[] enumArray = enumSetFromArray.toArray(new Day[0]);

        System.out.println("EnumSet from enum constants: " + enumSetFromArray);
        System.out.println("EnumSet converted to array: " + Arrays.toString(enumArray));

        // d) Serialize and deserialize the original enum set
        try {
            FileOutputStream fileOut = new FileOutputStream("enumSet.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(originalSet);
            out.close();
            fileOut.close();
            System.out.println("Original EnumSet serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred during serialization: " + e.getMessage());
        }

        try {
            FileInputStream fileIn = new FileInputStream("enumSet.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            EnumSet<Day> deserializedSet = (EnumSet<Day>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized EnumSet: " + deserializedSet);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred during deserialization: " + e.getMessage());
        }
    }
}

