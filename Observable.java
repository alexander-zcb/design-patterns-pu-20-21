package training;

public interface Observable {
    void startWatching(Observer observer);
    void stopWatching(Observer observer);
    void notifyObservers();
    String getUpdate();

}
