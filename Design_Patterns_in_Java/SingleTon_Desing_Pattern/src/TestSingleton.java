public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        if(s==s1) {
            System.out.println("Same instance");
        }else{
            System.out.println("Not same");
        }
    }
}