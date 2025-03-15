public class Main {
    public static void main(String[] args) {
        MultipleAdapter myPizza = new MultipleAdapter();

        System.out.println("Preparing pizza bun...");
        myPizza.bun();

        System.out.println("Adding toppings...");
        myPizza.toppings();

        System.out.println("Calling additional pizza methods...");
        myPizza.ctg.sausage();
        myPizza.ctg.bread();
        myPizza.dhk.capcicum();
        myPizza.dhk.peperoni();
        myPizza.syl.mutton();
        myPizza.syl.extrachese();

        System.out.println("Pizza is ready!");
    }
}