package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {
        while (true){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter num1: ");
            int num1 = sc.nextInt();
            System.out.println("Please Enter num2: ");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println("Result: " + num1 + "/" + num2 + "=" + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            System.out.println("You must enter integer. Please try again.");
        }
//        catch (InputMismatchException e) {
//            System.out.println("Exception: " + e);
//            System.out.println("You must enter integer. Please try again.");
//        } catch (ArithmeticException e1) {
//            System.out.println("Exception: " + e1);
//            System.out.println("You must enter integer. Please try again.");
//        }

        }
    }
}
