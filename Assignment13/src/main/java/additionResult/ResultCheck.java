package additionResult;

public class ResultCheck extends AdditionResult{

	public void check() {
		if((super.sum%10)==0) {
			System.out.println(super.sum+" - Addition result is divisible by 10 ");
		} 
		else {
			System.out.println(super.sum+" - Addition result not divisible by 10 ");
		}
	
	}
	public static void main(String[] args) {
		
		ResultCheck ob=new ResultCheck();
		ob.add();
		ob.result();
		ob.check();
	}

}
