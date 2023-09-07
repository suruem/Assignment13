package inheritanceProgram;

public class Bowler extends Player{
	int wickets;

	Bowler(String name, int matchesPlayed, int runsScored, int wickets) {
		super(name, matchesPlayed, runsScored);
		this.wickets=wickets;		
	}
	public void print()
    {    
        super.print();
        System.out.println(" This bowler has taken  " + wickets+" wickets in the match.");
    }

}
