package Instructors;

public class SetMovement {
    private Command command;

    public Command getCommand(){
        return command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void workOut(){
        if(this.command == null){
            System.out.println("Change the position!");
            return;
        }
        this.command.execute();
    }
}
