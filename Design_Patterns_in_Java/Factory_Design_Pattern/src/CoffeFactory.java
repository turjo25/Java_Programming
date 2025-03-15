public class CoffeFactory {
    public Coffe getCoffe(String coffeType) throws Exception {
        if(coffeType.equalsIgnoreCase("Cappuccino")){
            return new Cappuccino();
        }else if(coffeType.equalsIgnoreCase("Espresso")){
            return new Espresso();
        }else if(coffeType.equalsIgnoreCase("Latte")){
            return new Latte();
        }
        throw new Exception("Invalid CoffeType");
    }
}
