package Instructors;

public class Trainer {
    public static void main(String[] args) {
        Moves moves = new Moves();

        Command LayDownCommand = new LayDownCommand(moves);
        Command StandUpCommand = new StandUpCommand(moves);

        SetMovement move = new SetMovement();

        move.setCommand(LayDownCommand);
        move.workOut();

        move.setCommand(StandUpCommand);
        move.workOut();
    }
}
