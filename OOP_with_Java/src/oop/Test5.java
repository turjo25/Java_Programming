package oop;

public class Test5 {
    public static void main(String[] args) {
        Shape sh;
        sh=new Rectangle(4,5);
        sh.area();
        sh=new Circle(5);
        sh.area();
        sh=new Triangle(5,6);
        sh.area();
    }
}
