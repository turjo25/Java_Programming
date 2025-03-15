package oop;

public class Rectangle extends Shape{

    Rectangle(double dm1,double dm2){
//        this.dm1=dm1;
//        this.dm2=dm2;
        super(dm1,dm2);
    }

    @Override
    void area() {
        double r=dm1*dm2;
        System.out.println("Area="+r);

    }
}
