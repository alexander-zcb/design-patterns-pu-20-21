package training;

public class StandUpCommand implements Command{

    private Moves moves;

    public StandUpCommand(Moves moves) {
        this.moves = moves;
    }

    @Override
    public void execute() {
        this.moves.standUp();
    }
}
