package Strategy;

public class Gegen_press implements Current_Tactic {
    @Override
    public void tactic( String name) {
        // Implement Bubble Sort algorithm
        System.out.println("New Tactic of " + name);
        System.out.println("===================================================================");
        System.out.println("Formation: 4-3-3");
        System.out.println("Style: Direct-Play, Press on ball loss, Move Foward as ball won.");
        System.out.println("===================================================================");
    }
}
