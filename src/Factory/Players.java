package Factory;


import Command.Player;

abstract class player_Made{
        public abstract void display( );
}


class striker extends player_Made{
    String P_name;
    striker(String name){
        P_name = name;
    }
    @Override
    public void display() {
        System.out.println("New striker: " + P_name);
    }
}

class midfielder extends player_Made{
    String P_name;
    midfielder(String name){
        P_name = name;
    }
    @Override
    public void display() {
        System.out.println("New Midfielder: " + P_name);
    }
}

class defender extends player_Made implements Player {
    String P_name;
    defender(String name){
        P_name = name;
    }
    @Override
    public void display() {
        System.out.println("New Defender: " + P_name);
    }

    @Override
    public void StartCommand() {
        
    }

    @Override
    public void StopCommand() {

    }
}

class goalkeeper extends player_Made{
    String P_name;
    goalkeeper(String name){
        P_name = name;
    }
    @Override
    public void display() {
        System.out.println("New Goalie: " + P_name);
    }
}

abstract class player_Factory{
    public abstract player_Made factory(String name);
}

class striker_Fact extends player_Factory{
    @Override
    public player_Made factory(String name){
        return  new striker(name);
    }
}

class midfield_Fact extends player_Factory{
    @Override
    public player_Made factory(String name){
        return  new midfielder(name);
    }
}

class defender_Fact extends player_Factory{
    @Override
    public player_Made factory(String name){
        return  new defender(name);
    }
}


class goalie_Fact extends player_Factory{
    @Override
    public player_Made factory(String name){
        return  new goalkeeper(name);
    }
}




public class Players {

    public static void main(String[] args) {

        player_Factory newFact = new midfield_Fact();
        player_Made newPlayer = newFact.factory("the specialist");
        player_Made newPlayer2 = newFact.factory("CR7");
        newPlayer2.display();
        newPlayer.display();


    }
}
