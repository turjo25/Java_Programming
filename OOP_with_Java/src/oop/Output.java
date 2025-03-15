package oop;

class Output {
    void drive() {
        System.out.println("Driving a vehicle...");
    }

    void speedUp() {
        System.out.println("Speeding up a vehicle...");
    }
}

class Car extends Output {
    void drive() {
        System.out.println("Driving a car...");
    }
}

