public class Website implements Observer {

    private String webSiteName;

    public Website(String webSiteName) {
        this.webSiteName = webSiteName;
    }

    @Override
    public void updateScore(String score) {
        System.out.println("Notification to " + webSiteName + " : New score update - " + score);
    }

    @Override
    public void updateMatchStatus(String status) {
        System.out.println("Notification to " + webSiteName + " : New score update - " + status);
    }

}
