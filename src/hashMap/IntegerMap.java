package hashMap;
import java.util.*;
public class IntegerMap {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(1001, "Alice");
        employees.put(1002, "Bob");
        employees.put(1003, "Charlie");
        System.out.println("Name of employee with ID 1001: " + employees.get(1001));

        for(Integer id : employees.keySet()) {
            System.out.println("Employee ID: " + id +  " -> Name: " +employees.get(id));
        }

        if(employees.containsKey(1002)) {
            System.out.println("Employee with ID 1002: " + employees.get(1002));
        } else {
            System.out.println("ID 1002 not found...");
        }

    }
}
