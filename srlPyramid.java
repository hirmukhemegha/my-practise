
// *
// ***
// *****
// *******
// *********
import java.util.Scanner;

public class srlPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row; ");
        int row = sc.nextInt();
        // for loop of row
        for (int i = 1; i <= row; i++) {
            // for loop of space
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }

            // for loop of star
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
