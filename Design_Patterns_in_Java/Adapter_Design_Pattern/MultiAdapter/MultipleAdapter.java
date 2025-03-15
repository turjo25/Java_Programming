public class MultipleAdapter implements Pizza{
    ctgPizza ctg;
    dhkPizza dhk;
    sylPizza syl;
    MultipleAdapter(){
        ctg = new ctgPizza();
        dhk = new dhkPizza();
        syl = new sylPizza();
    }
    @Override
    public void bun() {
        ctg.bread();
        dhk.capcicum();
        syl.mutton();
    }

    @Override
    public void toppings() {
        ctg.sausage();
        dhk.peperoni();
        syl.extrachese();
    }
}
