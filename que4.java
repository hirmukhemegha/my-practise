
//make word fo 3 character from given char arrya
import java.lang.reflect.Array;
import java.util.*;

public class que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of char arrya: ");
        int size = sc.nextInt();

        String s = "";

        char[] myarray = new char[size];
        System.out.println("enter elements: ");
        for (int i = 0; i < myarray.length; i++) {
            myarray[i] = sc.next().charAt(0);
        }
        System.out.println("my char arrya is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(myarray[i] + " ");
        }
        System.out.println();
        s = new String(myarray);
        try {
            for (int i = 0; i < s.length(); i++) {

                for (int j = i; j <= i + 2; j++) {
                    System.out.print(s.charAt(j));
                    if (i == s.length()) {
                        i = 0;

                    }

                }
                System.out.println();

            }
        } catch (Exception e) {
            System.out.println("throw error");

        }

    }

}
