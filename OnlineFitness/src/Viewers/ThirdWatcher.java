package Viewers;

public class ThirdWatcher extends Viewer{
    public ThirdWatcher(Training training){
        this.training = training;
        this.training.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Watch and follow the training");
    }
}

