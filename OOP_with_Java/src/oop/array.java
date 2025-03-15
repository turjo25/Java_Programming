package oop;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array:");
        Scanner n=new Scanner(System.in);
        int size=n.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter the values of array:");
        for(int i=0;i<size;i++){
            arr[i]=n.nextInt();
        }
        System.out.println("Your inputs are:");
        for(int i=0;i<size;i++){
            System.out.println("The value of array ["+i+"] : "+arr[i]);
        }
        System.out.println("The even numbers of your arrays:");
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                System.out.println("The even value of array ["+i+"] : "+arr[i]);
            }
        }



    }
}
