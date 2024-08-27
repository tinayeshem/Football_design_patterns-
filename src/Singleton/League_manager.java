package Singleton;
import Command.command;
import Strategy.Current_Tactic;
import Team.Team;

public class League_manager  extends Team {

     String manager_name;

    private command command;




    private Current_Tactic philosophy;
    public  League_manager(String team,String manager_name){
        super(team);
        this.manager_name = manager_name;

    }

    public void setTactic(Current_Tactic philosophy) {
        this.philosophy = philosophy;
    }

    public void showTactic() {
        philosophy.tactic(super.getName());
    }


    public void display(){
        System.out.println("Manger of " + super.getName()  +": " + manager_name);
    }




    public void setCommand(command command) {
        this.command = command;
    }

    public void tellPlayer() {
        command.execute();
    }






}
