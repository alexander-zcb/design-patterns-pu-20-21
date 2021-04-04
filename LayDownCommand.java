package training;

public class LayDownCommand implements Command{

    private Moves moves;

    public LayDownCommand(Moves moves) {
        this.moves = moves;
    }

    @Override
    public void execute() {
        this.moves.layDown();
    }
}
