package Observer;
import java.util.Observer;

public interface Subject {
    void addObserver(observer observer_P);
    void removeObserver(observer observer_P);
    void notifyObservers();

}
