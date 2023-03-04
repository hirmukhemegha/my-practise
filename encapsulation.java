import java.util.*;

public class encapsulation {
    private int a;

    public void setA(int newA) {
        a = newA;
    }

    public int getA() {
        return a;
    }

}

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        encapsulation obj = new encapsulation();
        obj.getA();
    }
}
