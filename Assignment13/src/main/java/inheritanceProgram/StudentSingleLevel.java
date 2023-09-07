package inheritanceProgram;

import java.util.Scanner;

public class StudentSingleLevel {
	int roll_no;
	String name;
public void input() {
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter Roll Number: ");
	roll_no = sc.nextInt();  
	sc.nextLine(); 
	System.out.print("Enter Name: ");
	name = sc.nextLine();
	sc.close();
}
}
	