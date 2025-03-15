package oop;

public class superTest {
    public static void main(String[] args) {
        horse h = new horse();
    }
}
class animal{
    animal(){
        System.out.println("Inside animal class");
    }
}
class horse extends animal{
    horse(){
        System.out.println("Inside horse class");
    }
}