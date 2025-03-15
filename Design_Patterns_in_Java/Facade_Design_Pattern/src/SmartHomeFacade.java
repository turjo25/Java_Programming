public class SmartHomeFacade {
    private SmartLight light;
    private SmartAc ac;
    private SmartDoor door;

    public SmartHomeFacade(){
        this.light = new SmartLight();
        this.ac = new SmartAc();
        this.door = new SmartDoor();
    }
    public void turnOnHome(){
        System.out.println("\n🏡 Turning ON Smart Home:");
        light.turnOn();
        ac.turnOn();
        door.turnOn();
    }
    public void turnOffHome(){
        System.out.println("\n🏡 Turning OFF Smart Home:");
        light.turnOff();
        ac.turnOff();
        door.turnOff();
    }
}
