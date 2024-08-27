package Factory.Products;




public class goalkeeper implements Player  {
    String P_name;
    public goalkeeper(String name){
        P_name = name;
    }
    @Override
    public void display() {
        System.out.println("New Goalie: " + P_name);
    }


    //==============================Commands===============================================================================

    @Override
    public void start_run(){
        System.out.println(P_name + " is making a run.");
    }

    @Override
    public void stop_run(){
        System.out.println(P_name + " has stopped making a run.");
    }

    @Override
    public void get_into_space(){
        System.out.println(P_name + " is getting into space.");
    }

    @Override
    public void stop_in_space(){
        System.out.println(P_name + " is in space.");
    }

    @Override
    public void press(){
        System.out.println(P_name + " is pressing.");
    }

    @Override
    public void stop_press(){
        System.out.println(P_name + " has stopped pressing.");
    }

    @Override
    public void call_for_ball() {
        System.out.println(P_name + " is calling for the ball.");
    }

    @Override
    public void stop_calling() {
        System.out.println(P_name + " has stopped calling fpr the ball.");
    }



    //===================================Commands========================================================================




}
