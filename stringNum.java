import java.util.Scanner;

public class stringNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arrya: ");
        int size = sc.nextInt();
        String[] myarray = new String[size];
        System.out.println("enter strings: ");
        for (int i = 0; i < size; i++) {
            myarray[i] = sc.next();

        }
        System.out.println("my string array is: ");
        for (int i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < myarray.length; i++) {
            myarray[i] = myarray[i].replaceAll("[0-9]", "");
        }

        for (int i = 0; i < myarray.length; i++) {
            System.out.print("final string array is: " + myarray[i] + " ");
        }

    }

}
