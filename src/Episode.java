import java.util.ArrayList;

public class Episode implements Show{

    private ArrayList<Observer> episodes = new ArrayList<Observer>();

    private boolean newEpisode = true;

    public boolean newEpisode(){
        return newEpisode();
    }

    public void setNewEpisode(boolean newEpisode){
        this.newEpisode = newEpisode;
        notifyEpisodeObserver();
    }

    public void addObserver(Observer o){
        episodes.add(o);
    }

    public void notifyEpisodeObserver(){
        for(Observer episode: episodes) {
            episode.update();
        }

    }
}
