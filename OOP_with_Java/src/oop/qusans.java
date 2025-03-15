package oop;

import java.util.Scanner;
 public class qusans {
    int num;

     public void oddeven(int a){
         if(a%2==0)
             System.out.println("Even number");
         else
             System.out.println("Odd number");

     }

    public void posneg(int b) {
        if(b>0){
            System.out.println("Positive number");
        } else if (b==0) {
            System.out.println("Zero Number");
        }else
            System.out.println("Negative number");
    }

    public void checkleap(int num) {
        if (num % 400 == 0) {
            System.out.println(num+" is a leap year");
        } else if (num % 100==0) {
            System.out.println(num+" is not leap year");
        } else if (num % 4==0) {
            System.out.println(num+" is a leap year");
        }else
            System.out.println(num+" is not leap year");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        qusans q1=new qusans();

        System.out.println("Enter any number:");
        q1.num= input.nextInt();

        q1.oddeven(q1.num);
        q1.posneg(q1.num);
        q1.checkleap(q1.num);





    }
}
