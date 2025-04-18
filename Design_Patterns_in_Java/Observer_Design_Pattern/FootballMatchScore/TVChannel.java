public class TVChannel implements Observer{
    private String channelName;

    public TVChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void updateScore(String score) {
        System.out.println("Notification to " + channelName + " : New score update - " + score);
    }

    @Override
    public void updateMatchStatus(String status) {
        System.out.println("Notification to " + channelName + " : New score update - " + status);
    }
    
}
