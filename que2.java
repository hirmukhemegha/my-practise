
//LHS RHS SUM should equal
import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int[] myarray = new int[size];
        System.out.println("enter elements in array:");
        for (int i = 0; i < size; i++) {
            myarray[i] = sc.nextInt();

        }
        System.out.println("my int array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(myarray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < myarray.length; i++) {
            sum1 = sum1 + myarray[i];

            for (int j = i + 1; j < myarray.length; j++) {
                sum2 = sum2 + myarray[j];
            }
            if (sum1 == sum2) {
                System.out.println(sum1 + " " + "true");
                break;

            } else {
                sum2 = 0;
                continue;
            }

        }
        System.out.println("false");

    }

}
