
//Write a program to implement a bubble sort algorithm for sorting the elements of an array. We are given an array of N elements and we need to sort them in ascending order. But in this question we need to use Bubble sort, to sort the given array.
import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        int temp = 0;
        int[] arr = new int[size];
        System.out.println("enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
    }

}
