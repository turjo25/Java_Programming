package oop;

public class Test{
    public static void testFruit(Fruit f){
        System.out.println("----Printing Detail-----");
        if(f.hasFormalin()){
            System.out.println("Do not eat the "+f.getName()+".");
            System.out.println(f);
        }else{
            System.out.println("Eat the "+f.getName()+".");
            System.out.println(f);
        }
    }
    public static void main(String [] args){
        Fruit.Mango m = new Fruit.Mango();
        testFruit(m);
        Fruit.Jackfruit j = new Fruit.Jackfruit();
        testFruit(j);
    }
}
