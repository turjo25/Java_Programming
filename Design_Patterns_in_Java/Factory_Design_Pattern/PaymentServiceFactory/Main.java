public class Main {
    public static void main(String[] args) {
        // Create the UPI system
        UPIService upiService = new UPIService();
        // Perform transactions using Bkash
        System.out.println("---- Bkash Transaction ----");
        upiService.sendMoney("Bkash", 500);
        upiService.checkBalance("Bkash");
        upiService.getTransactionHistory("Bkash");
        System.out.println("---- Nagad Transaction ----");
        // Perform transactions using Nagad
        upiService.sendMoney("Nagad", 1000);
        upiService.checkBalance("Nagad");
        upiService.getTransactionHistory("Nagad");
        System.out.println("---- Rocket Transaction ----");
        // Perform transactions using Rocket
        upiService.sendMoney("Rocket", 200);
        upiService.checkBalance("Rocket");
        upiService.getTransactionHistory("Rocket");
    }
}
