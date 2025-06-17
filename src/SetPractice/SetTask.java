package SetPractice;

import java.util.*;

public class SetTask {
    public static void main(String[] args) {
        Set <String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");

        System.out.println(languages);
        System.out.println("Show how many unique languages are here: " + languages.size());
    }
}
