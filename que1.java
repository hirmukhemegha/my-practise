
//print elements form array whose product is given integer
import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        int[] myarray = new int[size];
        System.out.println("enter elements in arrya: ");
        for (int i = 0; i < myarray.length; i++) {
            myarray[i] = sc.nextInt();
        }

        System.out.println("my array is: ");
        for (int i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < myarray.length; i++) {
            for (int j = i + 1; j < myarray.length; j++) {
                if ((myarray[i] * myarray[j]) == num) {
                    System.out.println(i + " " + j);
                }
            }
        }

    }

}
