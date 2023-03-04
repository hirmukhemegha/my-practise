public class throwExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a / b;
        System.out.println(c);

        throw new ArithmeticException("cant divide by 0");
    }

}
