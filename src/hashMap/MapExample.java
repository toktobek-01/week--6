package hashMap;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");

        System.out.println("Capital of USA: " + capitals.get("USA"));

        for (String country : capitals.keySet()) {
            System.out.println(country + " -> " + capitals.get(country));
        }
    }
}
