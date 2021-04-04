package training;

public class Main {
    public static void main(String[] args) {
        Moves moves = new Moves();
        Instructor instructor = new Instructor();
        Command standUp = new StandUpCommand(moves);
        Command layDown = new LayDownCommand(moves);

        Observer obs1 = new MoveWatchers("Ivan");
        Observer obs2 = new MoveWatchers("Dimitar");
        Observer obs3 = new MoveWatchers("Stanimir");

        moves.startWatching(obs1);
        moves.startWatching(obs2);
        moves.startWatching(obs3);

        instructor.setCommand(standUp);
        instructor.tellPosition();

        moves.stopWatching(obs2);

        instructor.setCommand(layDown);
        instructor.tellPosition();




    }
}
