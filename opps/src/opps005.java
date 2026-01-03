abstract class Vehicle{ // abstract class
    abstract void start(); // abstract method
    abstract void stop();
}

class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("the car is starting");
    }

    @Override
    void stop() {
        System.out.println("the car is stoping");
    }
}

class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("the bike is starting");
    }

    @Override
    void stop() {
        System.out.println("the bike has stop");
    }
}

public class opps005 {
    public static void main(String[] args) {
        Vehicle v1;
        v1 = new Car(); //  runtime polymorphism
        v1.start();
        v1.stop();

        v1 = new Bike();
        v1.start();

    }
}
