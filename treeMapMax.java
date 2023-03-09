
//Create a TreeMap of strings and integers where the string represents a product name and the integer represents its price. Add at least 5 products to the map and write a method to print the product with the highest price.
import java.util.*;

public class treeMapMax {
    public static void main(String[] args) {
        TreeMap<String, Integer> m = new TreeMap<>();
        m.put("book", 80);
        m.put("pen", 10);
        m.put("eraser", 5);
        m.put("pad", 120);
        m.put("notebook", 70);

        int max = (Collections.max(m.values()));

        // put all value sin set
        Set<Map.Entry<String, Integer>> s = new HashSet<>(m.entrySet());
        int val = max;
        for (Map.Entry<String, Integer> entry : s) {
            if (entry.getValue().equals(val)) {
                System.out.println("max price is: " + max + " product is: " + entry.getKey());
            }

        }

    }

}
