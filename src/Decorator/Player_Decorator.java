package Decorator;

public class Player_Decorator implements Player {

    protected Player decoratedPlayer;

    public void playerDecorator(Player decoratedPlayer){
        this.decoratedPlayer = decoratedPlayer;
    }
    @Override
    public void  playerDescription() {
         decoratedPlayer.playerDescription();
    }
}




