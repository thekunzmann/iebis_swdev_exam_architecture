import java.util.Observable;

public interface Observer {
    public void update();

    @Override
    public void notifyObserver() {
        for (Observer user : user) {
            user.update();
        }
    }
}
