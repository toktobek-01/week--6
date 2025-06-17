package SetPractice;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // duplicate, will be ignored

        System.out.println("Names: " + names);
    }
}

