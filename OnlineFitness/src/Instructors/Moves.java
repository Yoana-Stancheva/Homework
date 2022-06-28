package Instructors;

public class Moves {
    private boolean movement;

    public void layDown(){
        System.out.println("Lay down on the ground!");
        this.movement = true;
    }

    public void standUp(){
        System.out.println("Stand up, please!");
        this.movement = false;
    }
}
