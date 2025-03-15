package oop;

public abstract class veichle {

    public veichle()
    {
        System.out.println("Vehicle is Created.");
    }

    public abstract void move();

    public void carry()
    {
        System.out.println("All Vehicle carry loads");
    }
}

class car2 extends veichle {

    public void move()
    {
        System.out.println("Car moves faster.");
    }

    public static void main(String[] args) {
        car2 c1 = new car2();
        c1.move();
        c1.carry();
    }
}