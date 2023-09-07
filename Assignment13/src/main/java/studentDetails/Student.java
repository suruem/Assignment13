package studentDetails;

public class Student {
	String name;
	int rollno;
	Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public static void main(String args[]) {
		Student s1=new Student();
		s1.setName("Suru");
		s1.setRollno(1);
		System.out.println("Name: "+s1.getName());
		System.out.println("Roll No: "+s1.getRollno());
		Address a=new Address();
		a.setCity("City1");
		a.setHousename("HouseName");
		a.setState("State");
		a.setCountry("Country");
		a.setPin("12331");
		System.out.println("Address: "+a.getHousename()+","+a.getCity()+","+a.getState()+","+a.getCountry()+","+a.getPin());
		
	}

}
