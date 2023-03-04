abstract class vehicleAbstraction {
    // hide main function
    abstract void start();
}

class car extends vehicleAbstraction {
    void start() {
        System.out.println("car starts with key");
    }
}

class bike extends car {
    void start() {
        System.out.println("bike starts with key");
    }

}

class mymain {
    public static void main(String[] args) {
        vehicleAbstraction obj = new bike();
        obj.start();

    }
}