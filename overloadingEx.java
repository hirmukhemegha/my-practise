class overloadingEx {
    // class should be same
    // method name same
    // arguments diff
    public void show(int a) {
        System.out.println("this is my method 1");

    }

    protected void show(String name) {
        System.out.println("this is my method 2");
    }

    private void show(int c, int b) {
        System.out.println("this is my method 3");

    }

    public static void main(String[] args) {
        // create object of class
        overloadingEx obj = new overloadingEx();
        obj.show(12);
        obj.show("tony");
        obj.show(12, 23);
    }

}
