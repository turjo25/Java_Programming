public class NagadService implements PaymentService{
    
    @Override
    public void sendMoney(int amount) {
        System.out.println("Nagad: Sending "+amount+" TK using PIN-based authentication.");
    }

    @Override
    public void checkBalance() {
       System.out.println("Nagad: Your balance is 8,000 TK. ");
    }

    @Override
    public void getTransactionHistory() {
       System.out.println("Nagad: Last transaction - Sent 1000 TK to 018XXXXXXXX.");
    }
}
