package Observer;
import Factory.Products.Player;

import java.util.Observer;

public interface Subject {
    void addObserver(Player observer_P);
    void removeObserver(Player observer_P);
    void notifyObservers();

}
