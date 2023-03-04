
//find determinent of 3by3 matrix
import java.util.*;

public class determinant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row: ");
        int row = sc.nextInt();
        System.out.println("enter col: ");
        int col = sc.nextInt();
        double x, y, z;
        double[][] myarray = new double[row][col];
        System.out.println("enter elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                myarray[i][j] = sc.nextDouble();
            }
        }
        System.out.println("matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(myarray[i][j] + " ");
            }
            System.out.println();
        }

        // determinant
        x = myarray[0][0] * (myarray[1][1] * myarray[2][2] - (myarray[2][1] * myarray[1][2]));
        y = myarray[0][1] * (myarray[1][0] * myarray[2][2] - (myarray[2][0] * myarray[1][2]));
        z = myarray[0][2] * (myarray[1][0] * myarray[2][1] - (myarray[2][0] * myarray[1][1]));

        System.out.println("determinant of matrix is: " + (x - y + z));

    }

}
