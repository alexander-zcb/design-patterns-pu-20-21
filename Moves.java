package training;

import java.util.ArrayList;
import java.util.List;

public class Moves implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private String moveName;
    private boolean isStanding;

    public void standUp(){
        this.isStanding = true;
        this.moveName = "standing up";
        this.notifyObservers();
        System.out.println("Command is to stand up");
    }

    public void layDown(){
        this.isStanding = false;
        this.moveName = "laying down";
        this.notifyObservers();
        System.out.println("Command is to lay down");
    }




    @Override
    public void startWatching(Observer observer) {
        this.observers.add(observer);
        observer.setMove(this);
    }

    @Override
    public void stopWatching(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: this.observers){
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.moveName;
    }

}
