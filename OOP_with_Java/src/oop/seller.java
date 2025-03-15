package oop;

public class seller {
    String name,position;
    int phone;



//    constractor:
//    special typer of methood and it wiii be named exactly same as class name
//    default constractor
    seller(){
        System.out.println("No value");
    }

//    parameter constractor
    seller(String n,String pos,int phn){
        name=n;
        position=pos;
        phone=phn;
    }

//    methood:
    void printdata(){
        System.out.println("Name= "+name);
        System.out.println("Gender= "+position);
        System.out.println("Phone= "+phone);
        System.out.println("\n");
    }
}
