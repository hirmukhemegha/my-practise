import java.util.*;

public class checkStringOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = sc.next();
        char[] a = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            a[i] = str.charAt(i);
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0 || a[i] == 1 || a[i] == 2 || a[i] == 3 || a[i] == 4 || a[i] == 5 || a[i] == 6 || a[i] == 7
                    || a[i] == 8 || a[i] == 9) {
                System.out.println(str + " is number");
            } else {
                System.out.println(str + " is string");
            }

        }

    }

}
