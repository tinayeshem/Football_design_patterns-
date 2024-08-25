package Decorator;

public class Team_Captain extends  Player_Decorator{

    @Override
    public void playerDecorator(Player decoratedPlayer) {
        super.playerDecorator(decoratedPlayer);
    }

    @Override
    public void playerDescription() {
         System.out.println("This Player is the team captain.");
    }
}
