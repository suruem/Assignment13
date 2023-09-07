package additionResult;

import java.util.Scanner;

public class AdditionResult {
int sum,a,b;
public void add() {
	System.out.println("Enter numbers");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();

sc.close();
}
public int result() {
	sum=a+b;
	return sum;
}

}
