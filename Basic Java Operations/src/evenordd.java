package org.example;

import java.util.Scanner;

public class evenordd {
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any number: ");
     int a= sc.nextInt();
     if (a%2==0){
         System.out.println("Even");
     }
     else {
         System.out.println("Odd");
     }

 }
}
