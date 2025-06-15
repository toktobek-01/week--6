import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Size: " + names.size()); // 3
        System.out.println("Contains Bob? " + names.contains("Bob")); // true

        for (String name : names) {
            System.out.println(name);
        }

        names.remove("Alice");
        System.out.println("After remove: " + names);
    }
}
