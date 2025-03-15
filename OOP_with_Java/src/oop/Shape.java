package oop;

public abstract class Shape {
    double dm1,dm2;
    Shape(double dim1,double dim2){
        this.dm1=dim1;
        this.dm2=dim2;
    }
    abstract void area();
}
