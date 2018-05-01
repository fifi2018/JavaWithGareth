	package Garage;
	
	import java.util.ArrayList;
	
	public class Garage {
		
		 ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

		public  Garage(String type, String model,String colour, int year)
		{//constructor
		
		}
		
		
		/*public void vehiclelist() {
			 vehicleList.add("Kia");
			 vehicleList.add("Mercedes");
			 vehicleList.add("Toyota");
			 vehicleList.add("Land Rover");
			 vehicleList.add("Audi"); 
			 System.out.println(vehicleList);
	}*/
		
		public void addAVehicle(Vehicle newVech) // add a vehicle in garage method to be called in main
		{
			
			this.vehicleList.add(newVech);
			
		}
		
		public Garage(String ca)
		{
			/*this.libraryCollection = new ArrayList<LibraryItem>();
			this.address = cAddress;*/
			this(ca,new ArrayList<Vehicle>());
		}

		public Garage(String ca, ArrayList<Vehicle> arrayList) {
			// TODO Auto-generated constructor stub
		}


		public void deleteVehicle(Vehicle oldVech) 
		{
			
			this.vehicleList.remove(oldVech);
			
		}
		
		
		public ArrayList<Vehicle> getvehicleList() {
			return vehicleList;
			
		}


		public ArrayList<Vehicle> getGarageCollection() {
			return vehicleList;
		}

		
	
}
