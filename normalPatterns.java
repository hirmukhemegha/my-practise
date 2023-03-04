
//1]
// *
// **
// ***
// ****
// *****
import java.util.*;

import javax.swing.text.html.CSS;

public class normalPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter row");
        // int row = sc.nextInt();
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 2]
        // *****
        // ****
        // ***
        // **
        // *

        // System.out.println("enter rows: ");
        // int row = sc.nextInt();
        // for (int i = row; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }

        // 3] pyramid

        // System.out.println("enter row: ");
        // int row = sc.nextInt();

        // outer for loop for row
        // for (int i = 1; i <= row; i++) {
        // // for loop for space
        // for (int j = 0; j < row - i; j++) {
        // System.out.print(" ");

        // }

        // // for loop for star
        // for (int k = 1; k <= (2 * i) - 1; k++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }

        // 4]ulta pyramid
        // System.out.println("enter row: ");
        // int row = sc.nextInt();
        // for (int i = row; i >= 1; i--) {
        // for (int j = i; j < row; j++) {
        // System.out.print(" ");

        // }

        // for (int k = 1; k <= (2 * i) - 1; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 5]
        // 1
        // 22
        // 333
        // 4444
        // 55555

        // System.out.println("enter row: ");
        // int row = sc.nextInt();

        // for (int n = 1, i = 0; i < row; i++, n++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print(n);
        // }
        // System.out.println();

        // }

        // 6]
        // 1
        // 12
        // 123
        // 1234
        // 12345

        // System.out.println("enter row: ");
        // int row = sc.nextInt();

        // for (int i = 0; i < row; i++) {
        // for (int n = 1, j = 0; j <= i; j++, n++) {
        // System.out.print(n);

        // }
        // System.out.println();
        // }

        // 7]
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // System.out.println("enter row: ");
        // int row = sc.nextInt();
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < row - i; j++) {
        // System.out.print(" ");
        // }
        // for (int n = 1, k = 0; k <= i; k++, n++) {
        // System.out.print(n + " ");
        // }
        // System.out.println();
        // }

        // 8]
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        // System.out.println("enter row: ");
        // int row = sc.nextInt();
        // int half = row / 2;
        // for (int i = 0; i <= half + 1; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = half + 1; i > 0; i--) {
        // for (int j = 1; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // 9]
        // A
        // BB
        // CCC
        // DDDD
        // System.out.println("enter row: ");
        // int row = sc.nextInt();
        // char ch = 'A';

        // for (int i = 0; i < row; i++) {
        // ch = 'A';

        // for (int j = 0; j <= i; j++) {
        // System.out.print(ch + " ");
        // ch++;

        // }
        // System.out.println();

        // }

        // 10]
        // 1
        // 22
        // 333
        // 4444
        // 55555

        // System.out.println("enter no of rows: ");
        // int row = sc.nextInt();
        // for (int a = 1, i = 0; i < row; i++, a++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print(a + " ");
        // }
        // System.out.println();
        // }

        // 11]
        // 1
        // 12
        // 123
        // 1234
        // System.out.println("enter row: ");
        // int row = sc.nextInt();
        // for (int i = 0; i < row; i++) {
        // for (int a = 1, j = 0; j <= i; j++, a++) {
        // System.out.print(a);
        // }
        // System.out.println();
        // }

        // 12]
        // A
        // AB
        // ABC
        // ABCD
        // ABCDEF

        // System.out.println("enter row: ");
        // int row = sc.nextInt();
        // char ch = 'A';
        // for (int i = 0; i < row; i++) {
        // ch = 'A';
        // for (int j = 0; j <= i; j++) {
        // System.out.print(ch + " ");
        // ch++;

        // }
        // System.out.println();

        // }

        // 13]
        // *****
        // *****
        // *****
        // *****
        // System.out.println("enter row: ");
        // int row = sc.nextInt();
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= row; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 14]
        // 54321
        // 54321
        // 54321
        // 54321
        // 54321

        // System.out.println("enter row: ");
        // int row = sc.nextInt();

        // for (int i = 0; i < row; i++) {
        // for (int a = row, j = row; j > 0; j--, a--) {
        // System.out.print(a + " ");
        // }
        // System.out.println();
        // }

        // 15]
        // ABCDE
        // FGHIJ
        // KLMNO
        // PQRST
        // UVWXY
        // System.out.println("enter row: ");
        // int row = sc.nextInt();
        // char ch = 'A';
        // for (int i = 0; i < row; i++) {
        // for (int j = row; j > 0; j--) {
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

        // 16]
        // **
        // ****
        // *******
        // System.out.println("enter row: ");
        // int row = sc.nextInt();
        // for (int i = 1; i < row; i += 2) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 17]
        // 555555555
        // 4444444
        // 33333
        // 222
        // 1
        // 222
        // 33333
        // 4444444
        // 555555555

        System.out.println("enter row: ");
        int row = sc.nextInt();
        int half = row / 2;
        for (int i = 0; i < half; i++) {
            for (int a = half, j = half; j > 1; j--) {
                System.out.print(a);
                a--;
            }
            System.out.println();

        }

    }
}
