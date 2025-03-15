public class Loose_coupling {
    //client just depends on an interface instead of concrete class
    interface Engine{
        void start();
    }
    class PetrolEngine implements Engine{
        public void start(){
            System.out.println("Petrol engine starting...");
        }
    }
    class Car{
        private Engine engine;
        Car(Engine engine){
            this.engine = engine;
        }
        void startCar(){
            engine.start();
        }
    }
    public void main(String[] args) {
        Engine engine = new PetrolEngine();
        Car car = new Car(engine);
        car.startCar();
    }
}
