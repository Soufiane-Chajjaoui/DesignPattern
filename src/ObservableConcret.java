import java.util.ArrayList;
import java.util.List;

public class ObservableConcret implements Observable{

    private List<Observer> observers = new ArrayList<>();
    private int state ;


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer O) {
        observers.add(O);
    }

    @Override
    public void removeObserver(Observer O) {
        observers.remove(O);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(this));
    }
}
