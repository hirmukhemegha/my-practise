
//find max and min from given array:
import java.util.Scanner;

public class maxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        // create int array
        int[] myArray = new int[size];
        System.out.println("enter elements: ");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println("my array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        // int max = myArray[0];
        // for (int i = 1; i < size; i++) {
        // if (myArray[i] > myArray[0]) {
        // max = myArray[i];
        // }
        // }
        // System.out.println("max int is: " + max);

        int min = myArray[0];
        for (int i = 1; i < size; i++) {
            if (myArray[i] < myArray[0]) {
                min = myArray[i];
            }
        }
        System.out.println("min int from array is: " + min);

    }

}
