public class ctgPizzaAdapter extends ctgPizza implements Pizza {
    @Override
    public void bun() {
        this.sausage();
    }

    @Override
    public void toppings() {
        this.bread();
    }
}
