public class SmartHomeFacade {
    private Lights lights;
    private Temperature temp;
    private Security sec;
    private TV tv;
    private MusicSystem musicSystem;

    public SmartHomeFacade(){
        this.lights = new Lights();
        this.temp = new Temperature();
        this.sec = new Security();
        this.tv = new TV();
        this.musicSystem = new MusicSystem();
    }
    public void LeaveHome(){
        System.out.println("--------Leaving Home--------");
        lights.turnOff();
        temp.setTemperature(25);
        sec.arm();
        tv.turnOffTV();
        System.out.println("House is now away mood");
    }
    public void ReturnHome(){
        System.out.println("--------Returning Home--------");
        lights.turnOn();
        temp.setTemperature(16);
        sec.disarm();
        tv.turnOnTV();
        musicSystem.playMusic("Enjoy the life!!!");
        System.out.println("House is now home mood");
    }
}
