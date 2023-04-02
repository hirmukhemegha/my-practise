//Write a program in Java to create a "BankAccount" class with methods to deposit and withdraw money, and to check the balance. Create an object of the "BankAccount" class and perform some transactions, such as depositing and withdrawing money, and printing the balance after each transaction.

import java.util.*;

public class banckAccound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = 100;
        System.out.println("initial balance is: " + bal);
        System.out.println("If u want to deposite amount choose= 1");
        System.out.println("If u want to withdraw amount choose= 2");

        System.out.println("enter user action: ");
        int a = sc.nextInt();

        int amount = 0;

        if (a == 1) {
            System.out.println("enter deposite emount: ");
            int dep = sc.nextInt();
            amount = bal + dep;
            System.out
                    .println("initially balance was " + bal + " after depositing " + dep + " total amount is: "
                            + amount);

        }

        if (a == 2) {
            System.out.println("enter withdraw amouht");
            int wid = sc.nextInt();
            if (wid <= bal) {
                amount = bal - wid;
                System.out.println(
                        "initially balance was " + bal + " after withdrawing " + wid + " total amount is: " + amount);
            } else if (wid > bal) {
                System.out.println("sorry you cant withdraw because it is beyond the prsent amount");
            }

        }

    }

}
