package DecoPattern;

public abstract class BakeDecorator extends Baking{

	
	public BakeDecorator(String bakeName, String ingredients, double ovenTemp) {
		super(bakeName, ingredients, ovenTemp);
	
		
	}
	
	protected Baking velvetCake;
	

	public void velvetStartmixing() {
		System.out.println(" Mix red food colouring with cocoa and add to flour mixture.");
		
	}
	
	public void velvetStartBaking() {
		System.out.println(" Mix red food colouring with cocoa and add to flour mixture.");
		
		
	}
	public void velvetCakeTemp(double ovenTemp) {
		
		ovenTemp=190.0;
		
		System.out.println("Oven temperature for a velvet cake is set at: "+ ovenTemp);
		
	}

	
	
	
}
