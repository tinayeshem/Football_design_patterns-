package Factory.Products;


import Singleton.League_manager;

public interface Player {
     void display();


    String getName();
     void start_run();
     void stop_run();

     void get_into_space();
     void stop_in_space();

     void press();
     void stop_press();

     void call_for_ball();
     void stop_calling();

     void update(String announcement);

     void current_event();





}
