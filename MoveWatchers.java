package training;

public class MoveWatchers implements Observer{

    private String name;
    private Observable move;

    public MoveWatchers(String name) {
        this.name = name;
    }

    @Override
    public void setMove(Observable move) {
        this.move = move;
    }

    @Override
    public void update() {
        String newMoveState = move.getUpdate();

        System.out.println(this.getName() + " changed move to: " + newMoveState);
    }

    public String getName() {
        return name;
    }
}
