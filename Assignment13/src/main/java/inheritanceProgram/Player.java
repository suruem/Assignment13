package inheritanceProgram;

public class Player {
	String name;
    int matchesPlayed;
    int runsScored;
    Player(String name, int matchesPlayed, int runsScored)
    {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }
public void print()
    {
        System.out.println("Player is "+name+ " and played " +matchesPlayed+ " matches and scored " + runsScored + " runs.");
    }

}
