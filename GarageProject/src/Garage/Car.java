package Garage;

import java.util.Date;

public class Car extends Vehicle{
	
	
          double engineSize;
	
	  public Car(String type, String model, String colour, int year,double engineSize) { //constructor
		super(type, model, colour, year);
		
		this.engineSize= engineSize;
		
	}
	  
	  public Date getdate() {
		  return new Date();
		
	}
	  public double getengineSize() {
		  return engineSize;
		
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
