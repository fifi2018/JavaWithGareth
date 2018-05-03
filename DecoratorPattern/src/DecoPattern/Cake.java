package DecoPattern;

public class Cake extends Baking{

	
	
	public Cake(String bakeName, String ingredients, double ovenTemp) {
		super(bakeName, ingredients, ovenTemp);
		
	}
	
	@Override
	public void startMixingIngredients() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startBaking() {
		System.out.println("Cream the butter and the sugar together until pale");
		
	}

	@Override
	public void setOvenTemp() {
		// TODO Auto-generated method stub
		
	}
	
	public void startIcing() {
		System.out.println("Use the flats of your hands to smooth the icing over the cake.\r\n" + 
				"Neatly trim away any excess icing. The cake is now ready to decorate.");
		
		
	}

	@Override
	public void bakeDecorator() {
		// TODO Auto-generated method stub
		
	}
	
	

}
