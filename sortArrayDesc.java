
//sort array in descending by value
import java.util.*;
import java.util.Map.Entry;
import java.lang.*;

public class sortArrayDesc {
    public static void main(String[] args) {
        Map<String, Integer> a = new HashMap<>();
        a.put("centium", 2008);
        a.put("tcs", 1999);
        a.put("psl", 2015);
        a.put("tata", 2023);
        a.put("ibm", 2001);

        // convert map into list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(a.entrySet()); // now list has all the values of map

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() { // we need custum comparator to sort
                                                                              // valueby hashmap value

            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) { // this line is to
                                                                                               // override comparator.
                                                                                               // e1 and e2 are two
                                                                                               // variables
                // return e1.getValue() - e2.getValue(); // it will in ascending order
                return e2.getValue() - e1.getValue();

            }

        });

        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " " + e.getValue());

        }

    }

}
