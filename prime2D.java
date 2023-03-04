
//find max , min, prime number from 2D arrya: 
import java.util.*;

public class prime2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row: ");
        int row = sc.nextInt();
        System.out.println("enter col: ");
        int col = sc.nextInt();
        int reminder = 0;
        int flag = 0;

        int[][] myarray = new int[row][col];
        System.out.println("enter elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                myarray[i][j] = sc.nextInt();
            }
        }

        System.out.println("my array is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(myarray[i][j] + " ");
            }
            System.out.println();
        }

        // find max
        int max = myarray[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < myarray[i][j]) {
                    max = myarray[i][j];
                }
            }
        }

        System.out.println("max number is: " + max);

        // find min

        int min = myarray[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (min > myarray[i][j]) {
                    min = myarray[i][j];
                }
            }
        }

        System.out.println("min number is: " + min);

        // find prime
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (myarray[i][j] == 0 || myarray[i][j] == 1) {
                    System.out.println(myarray[i][j] + " not prime number");

                } else {
                    for (int k = 2; k <= ((myarray[i][j]) / 2); k++) {
                        if (myarray[i][j] % k == 0) {
                            System.out.println(myarray[i][j] + " is not prime number");
                            flag = 1;
                            break;
                        }

                    }

                    if (flag == 0) {
                        System.out.println(myarray[i][j] + " is prime");
                    }

                }
            }

        }

    }
}
