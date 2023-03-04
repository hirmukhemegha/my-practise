
//print only numbers from array
import java.util.*;

public class que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = sc.nextLine();
        String ans = " ";

        char[] b = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            b[i] = str.charAt(i);
        }

        for (int i = 0; i < b.length; i++) {
            if (Character.isDigit(b[i])) {
                ans = ans + b[i];

            }
        }

        System.out.println(ans);

    }

}
