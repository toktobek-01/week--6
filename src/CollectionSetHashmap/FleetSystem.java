package CollectionSetHashmap;
import java.util.*;
public class FleetSystem {
    public static void main(String[] args) {
        Set<String> truck = new HashSet<>();
        Map<String, String> truckDrivers = new HashMap<>();
        Map<String, List<String>> deliveries = new HashMap<>();

        truck.add("TX1234");
        truck.add("CA5678");
        truck.add("NY9012");

        truckDrivers.put("TX1234", "John");
        truckDrivers.put("CA5678", "Emily");
        truckDrivers.put("NY9012", "Ali");

        deliveries.put("TX1234", Arrays.asList( "Dallas, Austin"));
        deliveries.put("CA5678", Arrays.asList("Los Angeles, San Diego"));
        deliveries.put("NY9012", Arrays.asList("New York", "Buffalo"));

        for(String t : truck) {
            System.out.println(" Truck: " + t);
            System.out.println(" Driver: " + truckDrivers.get(t));
            System.out.println(" Cities: " + deliveries.get(t));
            System.out.println();
        }
    }
}
