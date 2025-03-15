package oop;

public class Guitar extends Instrument {
    private static String Ukulele;

    public Guitar() {
        super();
    }

    public Guitar(String form) {
        super();

        System.out.println( Ukulele+"is the"+ form+"of guitar");
    }

    @Override
    public void play() {
        System.out.println("Strumming the guitar");
    }

    public void tune(String tuning) {
        System.out.println("Tuning the guitar to " + tuning);
    }
}