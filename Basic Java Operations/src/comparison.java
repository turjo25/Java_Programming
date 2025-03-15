package org.example;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        //comparison operators
        //a==b
        //a!=b
        //a>b
        //a<b
        //a>=b
        //a<=b

        //logical operators
        //&&-and
        //||-or

        //conditional statement
        boolean isSunUp =true;
        if(isSunUp==false)
            System.out.println("Day");
        else
            System.out.println("Night");

        int a=40;
        int b=40;
        if(a>=60&&b<=40)
            System.out.println("Both not less than 50");
        else
            System.out.println("Both less than 50");

        boolean isadult =true;
        //if(isadult)//true
        if(!isadult)//false
            System.out.println("Can vote");
        else
            System.out.println("Can't vote");


        System.out.println("Enter your amount: ");
        Scanner sc=new Scanner(System.in);
        int cash= sc.nextInt();

        if(cash<10){
            System.out.println("Nothing can be bought");
            System.out.println("Get more cash");
        }
        else if(cash>10 && cash<40)
            System.out.println("Can get one thing");
        else
            System.out.println("Can get everything");


    }
}
