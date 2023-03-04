class interviewCentium {
    void method1(int a) {
        System.out.println("one");

    }

    void method1(double a) {
        System.out.println("two");
    }

}

class myclass extends interviewCentium {
    void method1(double a) {
        System.out.println("three");
    }
}

class main {
    public static void main(String[] args) {
        myclass obj = new myclass();
        obj.method1(100);

    }
}
