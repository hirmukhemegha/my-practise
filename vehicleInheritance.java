
//inheritance types with ex:
import java.util.*;

class vehicleInheritance {
    // 1] single inheritance
    void stucture(String model, String price) {
        System.out.println("name of vehicle is: " + model + " price is: " + price);
    }

}

class bike extends vehicleInheritance {
    void shop(String name_of_shop) {
        System.out.println("bike is taken from " + name_of_shop + " shop");

    }
}

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter model: ");
        String model = sc.next();
        System.out.println("enter prise: ");
        String price = sc.next();
        System.out.println("enter shop name: ");
        String name_of_shop = sc.next();
        bike obj = new bike();
        obj.stucture(model, price);
        obj.shop(name_of_shop);

    }
}