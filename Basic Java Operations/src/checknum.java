package org.example;

import java.util.Scanner;

public class checknum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a= sc.nextInt();
        if (a>=0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
