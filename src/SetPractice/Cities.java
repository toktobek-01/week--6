package SetPractice;

import java.util.*;

public class Cities {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();

        cities.add("Dallas");
        cities.add("Austin");
        cities.add("Houston");
        cities.add("Dallas");
        cities.add("El-Paso");

        System.out.println(cities);
        System.out.println("What is the number of cities: " + cities.size());

        if (cities.contains("Austin")){
            System.out.println("Austin is in the list.");
        } else {
            System.out.println("Austin is NOT in the list.");
        }
    }
}
