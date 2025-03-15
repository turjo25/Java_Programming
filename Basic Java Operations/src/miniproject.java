//Asking the user to guess the random number that we have generated with Math.random
package org.example;

import java.util.Scanner;

public class miniproject {
    public static void main(String[] args){
        //generating random number
        int myNumber= (int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);


        int userNum=0;

        //asking user to guess
        do{
            System.out.println("Guess the number: ");
            userNum=sc.nextInt();

            if(userNum==myNumber) {
                System.out.println("CORRECT NUMBER!!!");
                break;
            }
            else if (userNum>myNumber)
                System.out.println("Your Number is Large!!");
            else
                System.out.println("Your Number is too Small!!");

        }while (userNum>=0);

        System.out.println("My number was: ");
        System.out.println(myNumber);

    }
}
