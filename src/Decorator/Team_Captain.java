package Decorator;

import Factory.Products.Player;

public class Team_Captain extends Player_Decorator {



    public Team_Captain(Player decoratedPlayer) {
        super.playerDecorator(decoratedPlayer);
    }

    @Override
    public void display() {

        System.out.println("New Captain: " + decoratedPlayer.getName());
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

    //========================================observer

    String announcement;


    @Override
    public void update(String announcement) {
        this.announcement = announcement;
    }

    public void current_event(){
        System.out.println(decoratedPlayer.getName() + " is doing this now: " + announcement);
    }


    //===========================================


    @Override
    public String getName() {
        return null;
    }






}
