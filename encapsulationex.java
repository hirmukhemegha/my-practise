import java.util.Scanner;

public class encapsulationex {
    // private variable
    private int age;

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

}

class mymain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        encapsulationex obj = new encapsulationex();
        int newAge = sc.nextInt();
        obj.setAge(newAge);
        System.out.println("entered age is: " + obj.getAge());

    }
}
