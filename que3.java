import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//collection que.take roll number and name as input if random roll number is asked print corrosponding name
import java.util.Collection;

public class que3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "abhay");
        map.put(2, "megha");
        map.put(3, "anu");
        map.put(4, "amey");
        map.put(5, "rutu");
        map.put(6, "raj");
        map.put(7, "ani");
        map.put(8, "meera");
        map.put(9, "priya");
        map.put(10, "tony");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter roll number");

        int input = sc.nextInt();
        System.out.println("the name of student whose roll number " + input + " is: " + map.get(input));

    }

}
