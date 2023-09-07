package discountProgram;

public class OffSeason {
	int price,d;
	double afterdisprice;
	public double discount(int price) {
		this.price=price;
		d=15;
		afterdisprice=price - price * d / 100.0;
		return afterdisprice;
	}
	public void diplay() {
		System.out.println("Price After discount in off season"+afterdisprice);
	}

}
