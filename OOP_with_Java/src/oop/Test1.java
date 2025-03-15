package oop;

public class Test1 {
    public static void main(String[] args) {
        MobileUser ms;//Reference Variable
        ms = new Rahim();
        ms.sendMessage();
        ms.call();
        ms = new Karim();
        ms.sendMessage();
        ms.call();
    }
}
