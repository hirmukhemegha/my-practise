
//print sum of array;
import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        int sum = 0;
        int[] array = new int[size];
        System.out.println("enter elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }

        System.out.println("total sum of int array is: " + sum);

    }

}
