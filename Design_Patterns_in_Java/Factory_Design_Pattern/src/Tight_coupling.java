public class Tight_coupling {
    //client is directly depend on a concrete class
    class Engine{
        void start(){
            System.out.println("Engine starting...");
        }
    }
    class Car{
        Engine e = new Engine();//engine class er object create krte hocce
        void startCar(){
            e.start();
        }
    }
}
