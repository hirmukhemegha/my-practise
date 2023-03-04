
//You are given a phone book that consists of people's names and their phone number.
//After that you will be given some person's name as query. For each query, print the phone number of that person.
import java.util.*;
import java.lang.*;
import java.math.BigInteger;;

public class que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = sc.nextLine();

        Map<String, Long> a = new HashMap<>();
        a.put("Megha", 8605506134L);
        a.put("Abhay", 9605506134L);
        a.put("Ravi", 8600506134L);
        a.put("Neha", 8125506134L);
        a.put("Meena", 9205506134L);
        a.put("Manu", 5635506134L);
        a.put("Tanu", 8608506134L);
        a.put("Tony", 8896506134L);
        a.put("Amit", 8135506134L);
        a.put("Raju", 8605506000L);
        // System.out.println(a.containsValue(name));
        boolean ans = a.containsKey(name);

        try {
            if (ans == true) {

                System.out.println(name + " " + a.get(name));
            } else if (ans == false) {
                System.out.println("not found");

            }

        } catch (Exception e) {
            System.out.println("not found");
        }
    }

}
