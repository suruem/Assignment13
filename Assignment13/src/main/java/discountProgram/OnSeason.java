package discountProgram;

public class OnSeason {
	int price,d;
	double afterdisprice;
	public double discount(int price) {
		this.price=price;
		d=40;
		afterdisprice=price - price * d / 100.0;
		return afterdisprice;
	}
	public void diplay() {
		System.out.println("Price After discount in on season"+afterdisprice);
	}
public static void main(String args[]) {
	OffSeason off=new OffSeason();
	OnSeason on=new OnSeason();
	off.discount(1000);
	off.diplay();
	on.discount(1000);
	on.diplay();
	
}
}
