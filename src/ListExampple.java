import java.util.*;
public class ListExampple {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits.remove("Apple");
        System.out.println("Apple is remove: " + fruits);
        System.out.println("Second fruit: " + fruits.get(1));
        fruits.get(0);
        System.out.println("After removing the first fruit we have: " + fruits);
        fruits.remove(1);
        fruits.add(1,"Grapes");
        System.out.println("We just removed Banana and added Grapes instead: ");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }

}
