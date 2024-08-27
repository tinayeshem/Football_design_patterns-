import Factory.Creators.Player_made;
import Factory.Creators.goalkeeper_fact;
import Factory.Products.Player;
import Singleton.League_manager;
import Strategy.Gegen_press;
import Team.Team;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Team chelsea = new Team("Chelsea FC");
        chelsea.setCoach_name("Jose Mourinho");
        System.out.println(chelsea.getName());
       League_manager coachName = chelsea.getCoach_name();
       coachName.display();
       coachName.setTactic(new Gegen_press());
       coachName.showTactic();
        Player_made new_goalie = new goalkeeper_fact();
        Player goalkeeper = new_goalie.createPlayer("joe hart");
        goalkeeper.display();
        chelsea.addPlayer(goalkeeper);



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}