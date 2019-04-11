public class Show implements Episode, Season{

    private String showName;

    private boolean newShow = true;

    public boolean newShow(){
        return newShow();
    }

    public void setNewShow(boolean newShow){
        this.newShow = newShow;
        notifyObserver();
    }

    public void addObserver(Observer o){
        showName.add(o);
    }

    public void notifyObserver(){
        for(Observer show: showName) {
            showName.update();
        }
    }
}
