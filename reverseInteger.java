import java.util.*;

public class reverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer: ");
        int a = sc.nextInt();
        int reverse = 0;
        for (; a != 0; a = a / 10) { // not mentioned initialization part of loop
            int reminder = a % 10;
            reverse = reverse * 10 + reminder;

        }
        System.out.println(reverse);

    }

}
