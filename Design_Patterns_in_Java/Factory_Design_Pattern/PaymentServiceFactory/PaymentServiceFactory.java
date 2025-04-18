public class PaymentServiceFactory {
    public PaymentService getService(String serviceName){
        if(serviceName.equalsIgnoreCase("Bkash")){
            return new BkashService();
        }else if(serviceName.equalsIgnoreCase("Nagad")){
            return new NagadService();
        }else if(serviceName.equalsIgnoreCase("Rocket")){
            return new RocketService();
        }else{
            throw new IllegalArgumentException("Unknown service: "+serviceName);
        }
    }
}
