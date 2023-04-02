
//ATM project code
import java.util.*;

public class ATM extends Thread {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int code = 1092;
        int amount = 45000;
        System.out.println("WELCOME");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

            e.printStackTrace();
        }

        System.out.println("Please Enter your card");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

            e.printStackTrace();
        }
        System.out.println("Choose language");
        System.out.println("E:English");
        System.out.println("M:Marathi");
        System.out.println("H:Hindi");
        String str = sc.next();

        System.out
                .println("After entering your card you will see home page if you are able to see press Y else press N");
        String s = sc.next();
        if (s.equals("Y")) {

            System.out.println("enter your pin code: ");
            int c = sc.nextInt();
            if (c == code) {
                System.out.println("choose option: ");
                System.out.println("1:Get bank Statement");
                System.out.println("2:Withdraw Amount");
                System.out.println("3:Reset pin ");
                int b = sc.nextInt();
                if (b == 1) {
                    System.out.println("total amount is: " + amount);
                } else if (b == 2) {
                    System.out.println("enter amount: ");
                    int am = sc.nextInt();
                    int finalAmout = amount - am;
                    System.out.println("initial amount was: " + amount + " Now total balance is: " + finalAmout);
                } else if (b == 3) {
                    System.out.println("_ _ _ _");
                    System.out.println("enter old pin");
                    int old = sc.nextInt();
                    System.out.println("enter new Pin: ");
                    String n = sc.next();
                    if (n.length() >= 5) {
                        System.out.println("Enter 4 digit pin");
                    } else {

                        System.out.println("Press C to confirm");
                        String str2 = sc.next();
                        System.out.println("Successfully done ");

                    }

                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                    System.out.println("You can remove your card");

                }
            } else {
                System.out.println("Wrong pin");
            }

        } else if (s.equals("N")) {
            System.out.println("Please insert card properly");
        }

    }

    public static void main(String[] args) {
        ATM t = new ATM();
        t.start();

    }

}
