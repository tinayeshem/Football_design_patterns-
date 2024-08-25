package Team;

import Singleton.League_manager;

import java.security.PublicKey;

public class Team {

    private String name;

    private League_manager Coach_name;


    public Team(String name){

        this.name = name;
    }

    public void setCoach_name(String Coach_name) {
        this.Coach_name = new League_manager(name,Coach_name);
    }

    public League_manager getCoach_name() {
        return Coach_name;
    }

    public String getName() {
        return this.name;
    }
}
