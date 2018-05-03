package DecoPattern;

public class VelvetDecorator extends BakeDecorator {

	
	public VelvetDecorator(String bakeName, String ingredients, double ovenTemp) {
		super(bakeName, ingredients, ovenTemp);
		// TODO Auto-generated constructor stub
	}

	public void VelvetDecorator() {
		
		System.out.println(" Mix red food colouring with cocoa and add to flour mixture.");
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void startMixingIngredients() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startBaking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOvenTemp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bakeDecorator() {
		
		VelvetDecorator();
	
	}

}
