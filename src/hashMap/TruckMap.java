package hashMap;
import java.util.*;

public class TruckMap {
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("John", "TX1234");
        names.put("Emily", "CA5678");
        names.put("Ali", "NY9012");
        System.out.println("Name of a driver: " + names.get("John"));

        for (String driver : names.keySet()) {
            System.out.println(driver + " drives truck " + names.get(driver));
        }

        if (names.containsKey("Ali")) {
            System.out.println("Ali is in the list.");
        } else {
            System.out.println("Ali is not in the list");
        }

        System.out.println("Total of drivers and trucks " + names.size());
    }
}
