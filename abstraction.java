import java.util.*;

abstract class abstraction {

    public abstract void mymethod();

}

class newcls extends abstraction {
    public void mymethod() {
        System.out.println("this is new class ");

    }

}

class main {
    public static void main(String[] args) {
        newcls obj = new newcls();
        obj.mymethod();
    }
}
