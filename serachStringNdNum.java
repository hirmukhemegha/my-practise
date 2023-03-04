
//find which is number and which is string
import java.util.*;

public class serachStringNdNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        int value = 0;
        String[] a = new String[size];
        char[] c = {};

        System.out.println("enter strings: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.next();

        }
        System.out.println("string array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < a.length; i++) {
            if (value = Integer.parseInt(a[i])) {
                System.out.println(a[i] + "it is number");
            }

        }

    }

}
