package Decorator;

import Factory.Products.Player;

public abstract class Player_Decorator implements Player {

    protected Player decoratedPlayer;

    public void playerDecorator(Player decoratedPlayer){
        this.decoratedPlayer = decoratedPlayer;
    }

}




