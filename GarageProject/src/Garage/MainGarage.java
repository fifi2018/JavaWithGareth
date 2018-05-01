package Garage;

public class MainGarage {

	public static void main(String[] args) {
		
		Car c = new Car ("Audi", "A5", "Red",2016, 1.6);

		c.VehicleDescription("Kia","Ceed", "Red", 2010);
		
		//Garage g = new Garage (null);
		//g.vehiclelist();
		
		for (int i = 0; i <10; i++) {
			String a = "Type"+i;
			String b= "Model"+i;
			
			System.out.println(a+" "+b+" "+c.colour);
		
		}

	}

}
