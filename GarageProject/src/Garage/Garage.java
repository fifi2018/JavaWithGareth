	package Garage;
	
	import java.util.ArrayList;
	
import java.util.Date;
	
	public class Garage {
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

		public  Garage(String type, String model,String colour, Date year) {//constructor
		
		}
		
		
		public void vehiclelist() {
			
			 /*vehicleList.add("Kia");
			 vehicleList.add("Mercedes");
			 vehicleList.add("Toyota");
			 vehicleList.add("Land Rover");
			 vehicleList.add("Audi"); */
			 
			 
			 System.out.println(vehicleList);
	}
		
		
		public void deleteVehicle() {
			
			vehicleList.remove(vehicleList);
			
		}
		
		
		//2 constructors
		public Garage(String nn) {
			this(nn,new ArrayList<Vehicle>());
		}
		
		public Garage(String nn, ArrayList<Vehicle> arrayList) {
			// TODO Auto-generated constructor stub
		}
	
}
