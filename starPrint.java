
// *
// **
// ***
// ****
// *****
import java.util.Scanner;

public class starPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row: ");
        int row = sc.nextInt();

        // for loop for row
        for (int i = 1; i <= row; i++) {
            // for loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
