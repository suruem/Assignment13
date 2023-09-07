package inheritanceProgram;

public class CricketMain {

	public static void main(String[] args) {
		Player p1=new Batsman("Sachin", 300, 15000, 200, 300);
		Player p2=new Bowler("Dhoni", 200, 9000, 25);
		
		p1.print();
		p2.print();
		
		
		

	}

}
