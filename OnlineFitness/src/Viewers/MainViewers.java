package Viewers;

import Instructors.Trainer;

public class MainViewers {
    public static void main(String[] args) {
        Training training = new Training();

        new FirstWatcher  (training);
        new SecondWatcher (training);
        new ThirdWatcher  (training);

        System.out.println("Change the position");
        training.setWork(1);

        System.out.println("Changing the position");
        training.setWork(2);
    }
}
