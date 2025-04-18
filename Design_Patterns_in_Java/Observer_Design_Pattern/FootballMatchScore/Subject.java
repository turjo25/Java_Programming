public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyScoreUpdate(String score);
    void notifyMatchStatusUpdate(String status);
}