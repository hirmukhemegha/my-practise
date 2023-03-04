
//count how many words are present in string:
import java.util.*;
import java.util.List;

public class countWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = sc.nextLine();
        int count = 1;

        // 1st way=
        // int count = str.split("\\s").length;
        // System.out.println("total words present in given string are: " + count);

        // 2nd way
        char[] a = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            a[i] = str.charAt(i);
        }

        for (int i = 0; i < a.length; i++) {
            if (Character.isWhitespace(a[i])) {
                count++;

            }

        }
        System.out.println("total words present in given string are: " + count);

    }

}
