package org.example;

import java.util.Scanner;

public class simplecalculator {
    public static void main(String[] args) {

        System.out.println("Enter two numbers: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Enter any character:(+,-,*,/)");
        Scanner st=new Scanner(System.in);
        String para=st.next();

        int result = 0;
        switch (para){
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
               result=a*b;
                break;
            case "/":
                result=a/b;
                break;
            default:
                System.out.println("Invalid");

        }
        System.out.println("Your result:");
        System.out.println(result);

    }
}