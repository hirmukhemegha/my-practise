
//basic overriding
import java.util.*;

class overriding1 {
    public static void method1(int a, int b) {
        int c = a + b;
        System.out.println("addition is: " + c);
    }

}

class overriding2 {
    public static void method1(int a, int b) {
        int c = a * b;
        System.out.println("product is: " + c);
    }
}

class overriding3 {
    void method1(int a, int b) {
        int c = a / b;
        System.out.println("division is: " + c);
    }
}

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b: ");
        int b = sc.nextInt();
        overriding1 obj = new overriding1();
        obj.method1(a, b);

        overriding2 obj2 = new overriding2();
        obj2.method1(a, b);

        overriding3 obj3 = new overriding3();
        obj3.method1(a, b);
    }
}
