import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class addTwoArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 6, 7, 8, 9, 10 };

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            l.add(a[i]);
        }

        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            l2.add(b[i]);
        }

        l.addAll(l2);
        System.out.println(l);

    }

}
