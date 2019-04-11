import java.util.Observable;

public class User implements Observer{

    enum Gender {Male, Female};
    String name;
    String emailAddress;
    int age;
    String address;
    String city;
    String zipCode;

    public User(String name, String emailAddress, int age, String address, String city, String zipCode, Gender gender) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.age = age;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
    }

    private Observable observable = null;

    public User (Observable = observable){
        this.observable = observable;
    }

    public void update(){
        subscribeToShow();
    }

    public void subscribeToShow(){
        observable.addObserver(this);
    }
}
