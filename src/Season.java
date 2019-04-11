public class Season{

    private boolean newSeason = true;

    public boolean newSeason(){
        return newSeason;
    }

    public void setNewSeason(boolean newSeason){
        this.newSeason = newSeason;
        notifySeasonObserver();
    }

    public void addObserver(Observer o){
        season.add(o);
    }

    public void notifySeasonObserverObserver(){
        for(Observer user: season) {
            season.update();
        }

    }

}
