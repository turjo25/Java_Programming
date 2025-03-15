public class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("Instance is created");
    }
    public void getMessage(){
        System.out.println("Inside a method");
    }
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
