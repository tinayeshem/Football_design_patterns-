package Singleton;
import Command.command;
import Factory.Products.Player;
import Observer.Subject;
import Observer.observer;
import Strategy.Current_Tactic;
import Team.Team;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class League_manager  extends Team  {

        String manager_name;

        Team Current_Team ;

        private command command;




        private Current_Tactic philosophy;
         public League_manager(String teamName,Team Current_Team ,String manager_name){
             super(teamName);
             this.Current_Team = Current_Team;
            this.manager_name = manager_name;
        }

        public void setTactic(Current_Tactic philosophy) {
            this.philosophy = philosophy;
        }

        public void showTactic() {
            philosophy.tactic(super.getName());
        }


        public void display(){
            System.out.println("Manager of " + super.getName()  +": " + manager_name);
        }




        public void setCommand(command commandChosen) {
            this.command = commandChosen;
        }

        public void tellPlayer(Player chosenPlayer) {
            command.execute();
        }





        //======================================Observer method

    private List<Player> observers = new ArrayList<>();

        private String  announcement;


        public void notifyObservers(LinkedList<Player> players) {
            for (Player Observer_P : players) {
                Observer_P.update(announcement);
            }
        }

        public void  setDinner(String restaurant){
            announcement = "Dinner scheduled at " + restaurant + ".";
        }

        public void setTraining(String Date, String time, int hours ){
            announcement = "\n" + "Training: " + Date + "\n" +
                            "Time: " + time + "\n" +
                            "Duration(hours): " + String.valueOf(hours) +"." ;
        }

        public void  setOuting(String re){
            announcement = "Outing with Team requested by manager "+  manager_name  +" at " + re;
        }



    //============================================================


    public Current_Tactic getPhilosophy() {
        return philosophy;
    }
}
