package oop;

public class Main1 {
    public static void main(String[ ] args) {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[1]);
        try {
            int x=5;
            int y=0;
            System.out.println(x/y);
            System.out.println(myNumbers[10]);

        }catch (ArithmeticException e1) {
            System.out.println("Something went wrong2."+e1);
        }
        catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong1."+e);
        }


        finally{
            System.out.println("Hello");
            System.out.println(myNumbers[0]);
        }
    }
}


