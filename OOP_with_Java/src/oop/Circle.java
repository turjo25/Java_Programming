package oop;

public class Circle extends Shape{
    Circle(double r){
       super(r,r);
    }

    @Override
    void area() {
        double r=Math.PI*dm1*dm2;
        System.out.println("Area="+r);

    }
}
