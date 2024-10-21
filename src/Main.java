import Command.Make_run;
import Command.command;
import Decorator.Player_Decorator;
import Decorator.Set_Piece_taker;
import Decorator.Team_Captain;
import Factory.Creators.Player_made;
import Factory.Creators.goalkeeper_fact;
import Factory.Products.Player;
import Factory.Products.goalkeeper;
import Singleton.League_manager;
import Strategy.Gegen_press;
import Strategy.Tiki_Taka;
import Team.Team;
import Factory.Creators.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Team chelsea = new Team("Chelsea FC");
        chelsea.setCoach_name("Enzo Maresca");
        League_manager Enzo_Maresca = chelsea.getCoach_Name();

        //================================Factory=====================================================

        goalkeeper_fact goalkeeperFact = new goalkeeper_fact();
        Player Robert_Sanchez = goalkeeperFact.createPlayer("Robert Sanchez");
        chelsea.addPlayer(Robert_Sanchez);

        defender_fact defenderFact = new defender_fact();
        Player Axel_Disasi = defenderFact.createPlayer("Axel Disasi");
        chelsea.addPlayer(Axel_Disasi);
        Player Levi_Cowil = defenderFact.createPlayer("Levi Cowil");
        chelsea.addPlayer(Levi_Cowil);
        Player Wesley_Fofana = defenderFact.createPlayer("Wesley Fofana");
        chelsea.addPlayer(Wesley_Fofana);
        Player Reece_James = defenderFact.createPlayer("Reece James");
        chelsea.addPlayer(Reece_James);


        midfielder_fact MidFact = new midfielder_fact();
        Player Cole_Palmer = defenderFact.createPlayer("Cole Palmer");
        chelsea.addPlayer(Cole_Palmer);
        Player Moises_Caciedo = defenderFact.createPlayer("Moises Caceido");
        chelsea.addPlayer(Moises_Caciedo);
        Player Romeo_Lavia = defenderFact.createPlayer("Romeo Lavia");
        chelsea.addPlayer(Romeo_Lavia);
        Player Enzo_Fernandes  = defenderFact.createPlayer("Enzo Fernandes");
        chelsea.addPlayer(Enzo_Fernandes);

        striker_fact strikerFact = new striker_fact();
        Player Nicolas_Jackson = strikerFact.createPlayer("Nicolas jackson");
        chelsea.addPlayer(Nicolas_Jackson);
        Player Christopher_Nkunku = strikerFact.createPlayer("Christopher Nkunku");
        chelsea.addPlayer(Christopher_Nkunku);


        //=================================Decorator==============================================================

        Player Captain = new Team_Captain(Reece_James);
        Captain.display();
        Player Set_Piece_Manager = new Set_Piece_taker(Cole_Palmer);
        Set_Piece_Manager.display();

        //========================================observer===================================================================

        Enzo_Maresca.setOuting("Big Ben");
        Enzo_Maresca.notifyObservers(chelsea.getPlayers());
        Axel_Disasi.current_event();
        Enzo_Maresca.setTraining("04/10/2024","14:00",4 );
        Enzo_Maresca.notifyObservers(chelsea.getPlayers());
        Christopher_Nkunku.current_event();

        //=====================================strategy=======================================================================

        Enzo_Maresca.setTactic(new Tiki_Taka());
        Enzo_Maresca.getPhilosophy().tactic("Cheeky-Tiger");


        //==============================================Command=======================================================================

        command runForball = new Make_run(Axel_Disasi);
        runForball.execute();
        runForball.setPlayer(Cole_Palmer);
        runForball.execute();
        runForball.stop();





        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}