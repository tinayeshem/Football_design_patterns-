package Team;
import java.util.LinkedList;

import Factory.Products.Player;
import Observer.Subject;
import Observer.observer;
import Singleton.League_manager;

import java.security.PublicKey;

public class Team  {

    private String name;
    Team Team_Obj;

    private League_manager Coach_name;

    LinkedList<Player> Players = new LinkedList<Player>();


    public Team(String name){
        this.name = name;
    }

    public void setCoach_name(String Coach_name) {

        Team_Obj = new Team(name);
        this.Coach_name = new League_manager(Coach_name,Team_Obj,Coach_name);
    }

    public League_manager getCoach_name() {
        return Coach_name;
    }



    public String getName() {
        return this.name;
    }

    public League_manager getCoach_Name(){
        return Coach_name;
    };


    public   void addPlayer( Player new_Player){
        Players.add(new_Player);
    }

    public   void removePlayer( Player new_Player){
        Players.remove(new_Player);
    }

    public LinkedList<Player> getPlayers() {
        return Players;
    }
}
