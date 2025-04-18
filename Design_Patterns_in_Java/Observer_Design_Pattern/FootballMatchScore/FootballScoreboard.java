import java.util.ArrayList;
import java.util.List;

public class FootballScoreboard implements Subject{
    private List<Observer>observers = new ArrayList<>();
    private String score;
    private String matchStatus;
    @Override
    public void subscribe(Observer observer) {
      observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyScoreUpdate(String score) {
        for(Observer observer : observers){
            observer.updateScore(score);
        }
    }

    @Override
    public void notifyMatchStatusUpdate(String status) {
        for(Observer observer : observers){
            observer.updateMatchStatus(status);
        }
    }

    public void setScore(String newScore) {
        this.score = newScore;
        notifyScoreUpdate(newScore);
    }

    public void setMatchStatus(String status) {
        this.matchStatus = status;
        notifyMatchStatusUpdate(status);
    }
    
}
