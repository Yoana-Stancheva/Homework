package Viewers;

public class SecondWatcher extends Viewer{
    public SecondWatcher(Training training){
        this.training = training;
        this.training.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Watch and follow the training");
    }
}
