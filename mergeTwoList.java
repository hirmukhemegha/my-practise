import java.util.*;

public class mergeTwoList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("C");
        l.add("E");
        l.add("D");
        l.add("B");
        Collections.sort(l);
        System.out.println(l);

        List<String> l2 = new ArrayList<>();
        l2.add("F");
        l2.add("I");
        l2.add("H");
        l2.add("J");
        l2.add("G");
        Collections.sort(l2);
        System.out.println(l2);

        l.addAll(l2);
        System.out.println(l);

    }
}
