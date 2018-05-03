	package Garage;
	
	public class MainGarage {
	
		public static void main(String[] args) {
			
			Garage myGarage = new Garage("The Garage");
			
	
			//c.VehicleDescription("Kia","Ceed", "blue", 2010);
			
			//Garage g = new Garage (null);
			//g.vehiclelist();
			
			for (int i = 0; i <1; i++)
            {
				String a = "Type "+i+" ";
				String b= "Model "+i+" ";
				String c= "Colour "+i+" ";
				String d= "Year"+i+"  ";
				
				System.out.println(" Type"+"  Colour "+"  Model "+"  Year ");
				
				Car firstcar = new Car ("Kia", "Cee'd", "Red", 2010, 1.6);
				Car secCar = new Car ("Audi", "RS7","White", 2010, 1.6); 
				Bus firstBus = new Bus ("Mercedes", "GT20", "Silver", 2014);
				
				
				myGarage.addAVehicle(firstcar);
			    myGarage.addAVehicle(secCar);
			    myGarage.addAVehicle(firstBus);
			    
			    
			    System.out.println(" -- -- -- -- -- -- -- -- -- -- ");
			  
			    System.out.println(secCar+ " Added to Garage");
			      System.out.println(" -- -- -- -- -- -- -- -- -- -- ");
			    System.out.println(firstBus+ " Added to Garage");  
			}
			for (Vehicle currentVech : myGarage.getGarageCollection()) 
			{
				
				//System.out.println(currentVech.toString());
				//System.out.println(toString());
			}

			
	
		}
	
	}
