package Viewers;
import java.util.ArrayList;
import java.util.List;

public class Training {
    private List <Viewer> viewers = new ArrayList<Viewer>();
    private int work;

    public int getWork(){
        return work;
    }

    public void setWork(int work){
        this.work = work;
        notifyAllViewers();
    }

    public void attach(Viewer viewer){
        viewers.add(viewer);
    }

    public void notifyAllViewers(){
        for(Viewer viewer : viewers){
            viewer.update();
        }
    }
}
