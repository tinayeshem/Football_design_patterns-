package Strategy;

public class Route_One implements Current_Tactic {
    @Override
    public void tactic(String name) {
        // Implement Bubble Sort algorithm
        System.out.println("New Tactic of " + name);
        System.out.println("===================================================================");
        System.out.println("Formation: 4-4-2");
        System.out.println("Style: Long Balls, Crosses, Strikers in the box,Overlapping FBs");
        System.out.println("===================================================================");
    }
}
