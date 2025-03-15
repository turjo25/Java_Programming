package oop;

public class mathfunction {
    public static void main(String[] args) {
        int a=10;
        int b=-26;
        double d=12.67;
        int c=4;

        System.out.println("Math.abs(" + d + ")=" + Math.abs(d));
        System.out.println("Math.abs(" + b + ")=" + Math.abs(b));
        System.out.println("Math.ceil(" + d + ")=" +Math.ceil(d));
        System.out.println("Math.abs(-0)=" +Math.abs(-0));
        System.out.println("Math.max(" + a + "," + b + ")=" + Math.max(a, b));


        System.out.println("Math.sqrt(" + d + ")=" + Math.sqrt(d));
        System.out.println("Math.pow=" + Math.pow(a,c));

    }
}
