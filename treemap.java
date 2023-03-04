import java.util.*;

public class treemap {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "A");
        m.put(3, "C");
        m.put(2, "B");
        m.put(5, "E");
        m.put(4, "D");

        TreeMap<Integer, String> t = new TreeMap<>();
        t.putAll(m);

        for (Map.Entry<Integer, String> n : t.entrySet()) {
            System.out.println(n.getKey() + "  " + n.getValue());
        }

    }

}
