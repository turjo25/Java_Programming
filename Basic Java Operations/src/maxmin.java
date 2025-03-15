package org.example;

import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input how many numbers: ");
        int size= sc.nextInt();
        int[] num=new int[size];
        System.out.println("Enter numbers: ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int max=num[0];
        for(int i=0;i<size;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Maximum Number is:");
        System.out.println(max);
    }
}
