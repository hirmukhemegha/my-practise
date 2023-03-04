//two ways to create thread:
//1]using thread class
//2]using runnable interface
//thread present java.lang package
public class threadCreate extends Thread {

    public void run() { // override run method

        int a = 4 + 5;
        System.out.println(a);

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }

    }

    public static void main(String[] args) {
        threadCreate obj = new threadCreate();
        obj.start(); // start thread
        obj.start(); // it will throw compiletime exception
    }

}
