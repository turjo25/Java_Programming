public interface PaymentService {
    void sendMoney(int amount);
    void checkBalance();
    void getTransactionHistory();
}
