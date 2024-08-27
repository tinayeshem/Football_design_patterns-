package Decorator;

import Factory.Products.Player;

public class Set_Piece_taker extends Player_Decorator{
     Set_Piece_taker(Player decoratedPlayer) {
        super.playerDecorator(decoratedPlayer);
    }

    @Override
    public void display() {
        System.out.println("New Defender: " + decoratedPlayer.getName());
        System.out.println("New Set_piece_taker: " + decoratedPlayer.getName());
    }

    @Override
    public void start_run(){
        System.out.println(decoratedPlayer.getName()  + " is making a run.");
    }

    @Override
    public void stop_run(){
        System.out.println(decoratedPlayer.getName()  + " has stopped making a run.");
    }

    @Override
    public void get_into_space(){
        System.out.println(decoratedPlayer.getName() + " is getting into space.");
    }

    @Override
    public void stop_in_space(){
        System.out.println(decoratedPlayer.getName()  + " is in space.");
    }

    @Override
    public void press(){
        System.out.println(decoratedPlayer.getName()  + " is pressing.");
    }

    @Override
    public void stop_press(){
        System.out.println(decoratedPlayer.getName()  + " has stopped pressing.");
    }

    @Override
    public void call_for_ball() {
        System.out.println(decoratedPlayer.getName()  + " is calling for the ball.");
    }

    @Override
    public void stop_calling() {
        System.out.println(decoratedPlayer.getName() + " has stopped calling fpr the ball.");
    }

    @Override
    public String getName() {
        return null;
    }
}
