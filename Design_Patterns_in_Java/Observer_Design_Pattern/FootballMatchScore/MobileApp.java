public class MobileApp implements Observer {
    private String deviceName;

    public MobileApp(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void updateScore(String score) {
        System.out.println("Notification to " + deviceName + " : New score update - " + score);
    }

    @Override
    public void updateMatchStatus(String status) {
        System.out.println("Notification to " + deviceName + " : New score update - " + status);
    }

}
