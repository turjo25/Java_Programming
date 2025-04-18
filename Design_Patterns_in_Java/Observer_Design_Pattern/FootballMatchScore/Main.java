public class Main {
    public static void main(String[] args) {
    // Create the scoreboard (Subject)
    FootballScoreboard scoreboard = new FootballScoreboard();
    // Create different platforms (Observers)
    Observer mobileApp = new MobileApp("John's Phone");
    Observer tvChannel = new TVChannel("ESPN");
    Observer website = new Website("LiveScore.com");
    // Platforms subscribe to the scoreboard
    scoreboard.subscribe(mobileApp);
    scoreboard.subscribe(tvChannel);
    scoreboard.subscribe(website);
    // Goal scored (notify all platforms)
    scoreboard.setScore("Team A 1 - 0 Team B");
    System.out.println("------");
    // Unsubscribe TV Channel
    scoreboard.unsubscribe(tvChannel);
    // Another goal scored (only subscribed platforms will be notified)
    scoreboard.setScore("Team A 2 - 0 Team B");
    System.out.println("------");
    // Match status changes to full-time
    scoreboard.setMatchStatus("Full-Time");
    }
    }