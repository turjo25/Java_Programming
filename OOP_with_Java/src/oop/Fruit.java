package oop;

public class Fruit{
    private boolean formalin = false;
    public String name = "";
    public Fruit(boolean formalin, String name){
        this.formalin = formalin;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean hasFormalin(){
        return formalin;
    }
    public static class Mango extends Fruit {
        public Mango() {
            super(true, "Mangoes");
        }

        @Override
        public String toString() {
            return "Mangos are bad for you.";
        }
    }
    public static class Jackfruit extends Fruit {
        public Jackfruit() {
            super(false, "Jackfruit");
        }

        @Override
        public String toString() {
            return "Jackfruits are good for you.";
        }
    }
}
