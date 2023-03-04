
//print given line is palindrom or not
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter line: ");
        String str = sc.nextLine();
        String ans = str.replace(" ", "");
        String finalAns = "";
        for (int i = 0; i < ans.length(); i++) {
            finalAns = ans.charAt(i) + finalAns;
        }
        if (finalAns.equalsIgnoreCase(ans)) {
            System.out.println("palindrome");
        } else {
            System.out.println("no palindrome");
        }

    }

}
