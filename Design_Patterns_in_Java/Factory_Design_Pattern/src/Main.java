import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of coffee:");
        String s = sc.nextLine();
        CoffeFactory coffeFactory = new CoffeFactory();
        try {
            Coffe c1 = coffeFactory.getCoffe(s);
            c1.prepare();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}