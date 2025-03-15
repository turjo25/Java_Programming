package org.example;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int year=sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("leap year");
        }
        // not a leap year if divisible by 100
        // but not divisible by 400
        else if (year % 100 == 0) {
            System.out.println("not a leap year");
        }
        // leap year if not divisible by 100
        // but divisible by 4
        else if (year % 4 == 0) {
            System.out.println("leap year");
        }
        // all other years are not leap years
        else {
            System.out.println("not leap year");
        }
    }
}
