package oop;

public class MusicStore {
    public static void main(String[] args) {
        Instrument instrumental = new Instrument();
        instrumental.play();
        instrumental.tune();

        Guitar ukulele = new Guitar("Smallest");
        ukulele.play();
        ukulele.tune("Drop D");

        Piano kalimba = new Piano("Pocket");
        kalimba.tune("key 440");
    }
}