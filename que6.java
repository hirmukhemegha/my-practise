
//count occurance of character from given string
import java.util.*;

public class que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = sc.next();
        String ans = " ";
        char[] a = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            a[i] = str.charAt(i);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            if (!Character.isDigit(a[i])) {
                ans = ans + a[i];
            }

        }

        System.out.println(ans);

        for (int i = 0; i < ans.length(); i++) {
            for (int j = i + 1; j < ans.length(); j++) {
                if (ans.charAt(i) == ans.charAt(j)) {
                    System.out.println(ans.charAt(i));

                }
            }
        }

    }

}
