public class MobileClient implements Observer {
    private String name;

    public MobileClient(String name) {
        this.name = name;
    }

    public void update(String videoTitle) {
        System.out.println("Notification to " + name + " New video uploaded - " + videoTitle);
    }
}
