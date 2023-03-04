
//reverse the user string(palindrome)
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = sc.nextLine();
        String ans = "";
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            ans = str.charAt(i) + ans;
        }
        reverse = ans;
        if (reverse.equals(str)) {
            System.out.println("yes.it is palindrome");
        } else {
            System.out.println("no palindrome");
        }

    }
}
