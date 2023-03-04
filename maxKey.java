import java.util.*;

public class maxKey {
    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(1, 89);
        m.put(2, 9);
        m.put(3, 45);
        m.put(4, 99);
        m.put(5, 14);

        int min = (Collections.min(m.keySet()));
        // for (Map.Entry<Integer, Integer> entry : m.entrySet()) {

        // if (entry.getValue() == max) {
        // System.out.println(entry.getValue());
        // }

        // }
        System.out.println((Collections.min(m.keySet())));

    }

}
