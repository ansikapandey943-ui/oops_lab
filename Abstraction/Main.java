interface Vehicle {
    void start();
    void stop();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starting");
    }

    public void stop() {
        System.out.println("Bike stopping");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.stop();
    }
}