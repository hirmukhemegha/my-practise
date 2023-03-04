import java.util.*;

import javax.sound.midi.Soundbank;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        int ans = 0;

        int len = (int) (Math.log10(num) + 1);
        System.out.println("length of given integer is: " + len);

        String temp = Integer.toString(num);
        int[] a = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            a[i] = Character.getNumericValue(temp.charAt(i));
        }

        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i]);
        // }
        // System.out.println();

        for (int i = 0; i < a.length; i++) {
            ans = (int) Math.pow(a[i], len);
            sum = sum + ans;
        }
        if (sum == num) {
            System.out.println(num + " is armstrong number");
        } else {
            System.out.println(num + " is not armstrong number");
        }

    }

}
