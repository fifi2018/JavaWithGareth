package Garage;

public class Bus extends Vehicle {
	
	
	  public Bus(String type, String model, String colour, int year) { //constructor
		super(type, model, colour, year);
		
	}

	public void VehicleStarts() {
		  System.out.println("Vehicle: starts engine ");
	  }
	  
	 public void VehicleMoves() {
		 System.out.println("Vehicle: starts moving ");
		 
	 }
	 
	  public void VehicleStops() {
		  System.out.println("Vehicle: stops ");
		  
	  }
	  
	 public void VehicleDescription(String type, String model, String colour, int year) {
		  
		System.out.println("Vehicle: "+type+" is a "+model+" model manufactured year "+year+ " and it's colour is "+colour+".");
		
	}
	

	

}
