
// output:
// A
// AAA
// AAAAA
// AAAAAAA
// AAAAA
// AAA
// A
import java.util.*;

public class patternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row: ");
        int row = sc.nextInt();
        int n = row / 2;

        for (int i = 0; i <= n + 1; i++) {
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("A");

            }
            System.out.println();

        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= (2 * i); j++) {
                System.out.print("A");

            }
            System.out.println();
        }

    }

}
