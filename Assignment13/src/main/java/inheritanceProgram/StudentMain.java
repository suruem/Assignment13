package inheritanceProgram;

public class StudentMain extends StudentSingleLevel{
	public void display() {
	System.out.println("Student details : ");
	System.out.println("Roll Number is: "+roll_no);
	System.out.println("Your name is: "+name);
	}
 public static void main(String args[]) {
	 StudentMain obj = new StudentMain();
		obj.input();
		obj.display();

		  }
	}


