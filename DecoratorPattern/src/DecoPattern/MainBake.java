package DecoPattern;

public class MainBake {

	public static void main(String[] args) {
		Scones s = new Scones ("Butterscones", "Flour, Butter", 220.0, 4); // type of scones, ingredients,temp,number of scones
		Scones s1 = new Scones ("Cheesescones", "Flour, Butter & Cheese", 200.0, 6);
		
		Cake c = new Cake("Plain Cake", "Flour, Butter", 220.0);
		
		VelvetDecorator v = new VelvetDecorator( null, null, 0);
		
		
		
		
		
		System.out.println("How to bake "+s.getBakeName());
		s.startBaking();
		s.setOvenTemp();
	   System.out.println(" -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
       System.out.println("The temperature for butterscones is: "+s.getOvenTemp() );
       System.out.println("The temperature for cheesescones is: "+s1.getOvenTemp() + " and the ingredients are: "+s1.getIngredients() );
       System.out.println(" -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
       System.out.println("How to bake a plain cake");
       c.startBaking();
       System.out.println("How to bake a velvet cake");
       v.VelvetDecorator();
       
       
       
	}
	
	
	
	
	
	

}
