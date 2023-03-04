
//check whether given string is anagram with sting array
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = sc.nextLine();
        // create string array
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        String[] myarray = new String[n];

        String ans1 = "";
        String ans2 = "";
        System.out.println("enter string elements in array");
        for (int i = 0; i < n; i++) {
            myarray[i] = sc.nextLine();

        }
        System.out.println("string array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(myarray[i] + " ");
        }
        System.out.println();

        char[] array2 = new char[str.length()];
        for (int c = 0; c < myarray.length; c++) {
            char[] array1 = new char[myarray[c].length()];

        }

        for (int k = 0; k < str.length(); k++) {
            array2[k] = str.charAt(k);

        }

        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i].length() == str.length()) {
                for (int j = 0; j < myarray[i].length(); j++) {

                    array1[j] = myarray[i].charAt(j);

                }

                Arrays.sort(array2);

                // for (int m = 0; m < array1.length; m++) {
                // ans1 = ans1 + array1[m];

                // }
                // for (int x = 0; x < array2.length; x++) {
                // ans2 = ans2 + array2[n];
                // }

                if (array1.equals(array2)) {
                    System.out.println(myarray[i] + " is anagram with string array ");
                }

            } else {
                System.out.println(myarray[i] + "  is no anagram with string");
            }
            continue;
        }

    }

}
