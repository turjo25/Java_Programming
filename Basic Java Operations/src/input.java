package org.example;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Input your age: ");
//        float age=sc.nextFloat();
//        System.out.println("Your age="+age);

//        for string input
//        System.out.print("Enter something: ");
//        String name=sc.next();//this will only take single word
//        System.out.println(name);

        String line=sc.nextLine();//this will take lines
        System.out.println(line);

    }
}