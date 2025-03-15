package oop;

public class vehicle {
    protected int speed = 50;

    public vehicle(String color) {
        System.out.println("Vehicle is created with  color:" + color);
    }

    public void display() {
        System.out.println("The vehicle Speed is: " + speed);
    }
}


