	package Garage;
	
	public class MainGarage {
	
		public static void main(String[] args) {
			
			Garage myGarage = new Garage("The Garage");
	
			//c.VehicleDescription("Kia","Ceed", "blue", 2010);
			
			//Garage g = new Garage (null);
			//g.vehiclelist();
			
			for (int i = 0; i <10; i++)
            {
				String a = "Type "+i;
				String b= "Model "+i;
				String c= "Colour "+i;
				int d= 2001+i;
				
				Car firstcar = new Car (a, b, c, d, 1.6);
				myGarage.addAVehicle(firstcar);
				
				//System.out.println(a+" "+b+" "+firstcar.colour);
			
			}
			for (Vehicle currentVech : myGarage.getGarageCollection()) 
			{
				
				System.out.println(currentVech.toString());
			}

			
	
		}
	
	}
