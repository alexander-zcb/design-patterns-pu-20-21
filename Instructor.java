package training;

public class Instructor {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void tellPosition(){
        System.out.println("Instructed the command");
        this.command.execute();
    }
}
