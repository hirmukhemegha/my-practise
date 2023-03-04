
//if one condition is true then only move to second condition
import java.util.Scanner;

public class oneCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userEmail = "admin@gmail.com";
        String password = "password";
        System.out.println("enter user email: ");
        String mail = sc.nextLine();
        if (mail.equals(userEmail)) {
            System.out.println("enter your password: ");
            String pass = sc.nextLine();
            if (pass.equals(password)) {
                System.out.println("welcome. you are looged in.");
            } else {
                System.out.println("sorry. wrong password.");
            }
        } else {
            System.out.println("wrong emailId.");
        }

    }

}
