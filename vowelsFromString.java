import java.util.*;

public class vowelsFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = sc.nextLine();
        int count = 0;
        int ans = 0;
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        System.out.println(str);

        char[] a = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            a[i] = str.charAt(i);
        }

        System.out.println("string to char is:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < vowels.length; j++) {
                if (a[i] == vowels[j]) {
                    count = count + 1;

                }
            }
        }

        System.out.println(count + " vowels present in given string");

    }

}
