import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//for loop
//        for(int i=0; i<=100;i++){
//            System.out.println(i);
//
//        whileloop
//        int i=0;
//        while (i<=100){
//            System.out.println(i);
//            i++;
//        }

//        doWhile
//        int i=0;
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<=100);
//        Scanner sc= new Scanner(System.in);
//        int number=0;
//        do{
//            System.out.println("Enter the number: ");
//            number=sc.nextInt();
//            System.out.println("Your number: "+number);
//        }while (number>=0);
//
//        System.out.println("The End");

//        break and continue
        int i=0;
        while (true){
            if(i==3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if(i>5){
                break;
            }
        }
    }
}