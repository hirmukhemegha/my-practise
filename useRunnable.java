class useRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello.Be positive");

    }

    public static void main(String[] args) {
        useRunnable obj = new useRunnable();
        Thread t = new Thread(obj);  //we have pass obj referance into thread constructor
        t.start();
    }

}
