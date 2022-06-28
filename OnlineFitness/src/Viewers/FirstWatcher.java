package Viewers;

public class FirstWatcher extends Viewer{
    public FirstWatcher(Training training){
        this.training = training;
        this.training.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Watch and follow the training");
    }
}
