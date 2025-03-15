package oop;

public class Triangle extends Shape{
    Triangle(double dm1,double dm2){
//        this.dm1=dm1;
//        this.dm2=dm2;
        super(dm1,dm2);
    }

    @Override
    void area() {
        double r=0.5*dm1*dm2;
        System.out.println("Area="+r);

    }
}
