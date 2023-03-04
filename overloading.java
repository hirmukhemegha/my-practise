
//basic overloading que: 
import java.util.*;

class overloading {
    public static void method1(String b, int a) {
        System.out.println("name of person is: " + b + " age is: " + a);
    }

    public static void method1(int cls) {
        System.out.println("person is studying in: " + cls + " class");
    }

    public static void method1(String city) {
        System.out.println("person is living in : " + city);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String b = sc.nextLine();
        System.out.println("enter age");
        int a = sc.nextInt();
        System.out.println("enter class");
        int cls = sc.nextInt();
        System.out.println("enter city");
        String city = sc.next();

        overloading obj = new overloading();
        obj.method1(b, a);
        obj.method1(cls);
        obj.method1(city);

    }

}
