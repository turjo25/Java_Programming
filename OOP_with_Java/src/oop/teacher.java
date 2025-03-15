package oop;

public class teacher {
    String gender,name;//variable
    double phone;//variable

//    for felxibiltiy we can use mathood
//    returntype name(){
//
//    }

    void setinfo(String nam,String gen,int ph){//parameterized methood
        name=nam;
        gender=gen;
        phone=ph;
    }
    void printdata(){
        System.out.println("Name= "+name);
        System.out.println("Gender= "+gender);
        System.out.println("Phone= "+phone);
        System.out.println("\n");
    }



}
