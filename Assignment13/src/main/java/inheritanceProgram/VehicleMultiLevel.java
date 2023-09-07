package inheritanceProgram;

public class VehicleMultiLevel extends CarModel {
	public void engine()
	   {
		System.out.println("Engine Type: Petrol");
	   }
	public static void main(String[] args) {
		VehicleMultiLevel ob=new VehicleMultiLevel();
		ob.vehicleType();
		ob.brand();
		ob.engine();
		ob.speed();

	}

}
