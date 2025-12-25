package oops.day8;

abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}
