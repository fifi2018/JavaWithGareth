package Garage;

public abstract class Vehicle {
	
  String type;
  String colour;
  int year;
  String model;
  
 
 	 public  Vehicle(String type, String model,String colour, int year) {//constructor
		 
		 this.type = type;
		 this.model = model;
		 this.colour = colour;
		 this.year = year;
	 }
 	 
 
 	 
 	 public String gettype() {
		return type;	 
 	 }
 	 
 	 public String settype() { 
 		return type;	 
  	 }
 	 
 	 
 	 
 	 
 	 public String getcolour() {
 		return colour;	
  	 }
 	 
 	 public String setcolour() {
  		return colour;	
   	 }
 	 
 	 
 	 
 	 
 	 public int getyear() {
 		return year;	 
  	 }
 	 public int setyear() {
  		return year;	 
   	 }
 	 
 	 
 	 
 	 public String getmodel() {
 		return model;	 
  	 }
 	 public String setmodel() {
  		return model;	 
   	 }
 	 
 	 
 	 
 	 public String toString() {
		return colour;
 		 
 	 }
 	 
 abstract public void VehicleStarts();
 
 abstract public void VehicleMoves();
 
 abstract public void VehicleStops();
 
 abstract public void VehicleDescription(String type, String model,String Colour, int year);
 
}

