import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    public void uploadVideo(String title) {
        notifySubscribers(title);
    }

    private void notifySubscribers(String title) {
        for (Observer subscriber : subscribers) {
            subscriber.update(title);
        }
    }
}
