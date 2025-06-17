package Guests;
import java.util.*;

public class Guests {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Spike");

        System.out.println(names);

        names.add(1, "Tyke");

        names.remove("Spike");

        System.out.println("Updated names: " + names);

        if (names.contains("Jerry")) {
            System.out.println("Jerry is on the list.");
        } else {
            System.out.println("Jerry is not on the list.");
        }

    }
}
