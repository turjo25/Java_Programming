package oop;

public class Piano extends Instrument {
    public Piano(String form) {
        super();
        System.out.println("Piano String form : " + form);
    }
    public void tune(String tuning) {
        System.out.println("Tuning the piano to " + tuning);
    }
}