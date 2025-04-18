public class UPIService {
    private PaymentServiceFactory factory;

    public UPIService(){
        this.factory = new PaymentServiceFactory();
    }
    public void sendMoney(String serviceName, int amount){
        PaymentService service = factory.getService(serviceName);
        service.sendMoney(amount);
    }
    public void checkBalance(String serviceName){
        PaymentService service = factory.getService(serviceName);
        service.checkBalance();
    }
    public void getTransactionHistory(String serviceName){
        PaymentService service = factory.getService(serviceName);
        service.getTransactionHistory();
    }
}
