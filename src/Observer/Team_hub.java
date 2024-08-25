package Observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Team_hub implements Subject{
    private List<observer> observers = new ArrayList<>();
    private String anouncemement;

    @Override
    public void addObserver(observer Observer_P) {
        observers.add(Observer_P);
    }

    @Override
    public void removeObserver(observer Observer_P) {
        observers.remove(Observer_P);
    }

    @Override
    public void notifyObservers() {
        for (observer Observer_P : observers) {
            Observer_P.update(anouncemement);
        }
    }

    public void  setDinner(String restaurant){
        System.out.println("Dinner scheduled at " + restaurant);
    }

    public void setTraining(String Date, String time, int hours ){
        System.out.println("Training: " + Date );
        System.out.println("Time: " + time );
        System.out.println("Duration(hours): " + hours );
    }

    public void  setOuting(String re){
        System.out.println("Outing with Team.Team requested by manager.");
    }


}
