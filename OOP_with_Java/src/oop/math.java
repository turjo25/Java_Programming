package oop;

public class math {
    public static String divideNumber(int a, int b) {
        if (b == 0) {
            return "Error: Division by zero is not allowed";
        } else {
            int result = a / b;
            return String.valueOf(result);
        }
    }
    public static void main(String[] args) {
        System.out.println(divideNumber(10, 2));
        System.out.println(divideNumber(10, 0));
    }
}

