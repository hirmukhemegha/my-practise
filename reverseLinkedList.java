import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class reverseLinkedList {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.add(18);
        l.add(12);
        l.add(0);
        l.add(-2);
        l.add(1);

        Collections.reverse(l);
        System.out.println(l);

    }

}
