package inheritanceProgram;

public class Batsman extends Player {
	int sixes;
    int fours;
	Batsman(String name, int matchesPlayed, int runsScored, int sixes, int fours) {
		super(name, matchesPlayed, runsScored);
		 this.sixes = sixes;
	     this.fours = fours;
	}
	public void print()
    {    
        super.print();
        System.out.println(" This player scored " + sixes +  " sixes and " + fours + " fours.");
    }

}
