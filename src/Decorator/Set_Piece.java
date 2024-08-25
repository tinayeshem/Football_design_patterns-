package Decorator;

public class Set_Piece extends Player_Decorator{

    @Override
    public void playerDecorator(Player decoratedPlayer) {
        super.playerDecorator(decoratedPlayer);
    }

    @Override
    public void playerDescription() {
        System.out.println("This Player is the set-piece taker.");
    }


}
