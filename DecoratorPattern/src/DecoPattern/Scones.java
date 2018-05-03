package DecoPattern;

public class Scones extends Baking {


    int numOfScones;
   // int sconesOvenTemp = 220;
	

 public Scones(String bakeName, String ingredients, double ovenTemp, int numOfScones) {
		super(bakeName, ingredients, ovenTemp);
		
		this.numOfScones=numOfScones;
	}
	
	
	@Override
	public void startMixingIngredients() {
		System.out.println("Mix together the flower & salt & rub in the butter");
		
	}

	@Override
	public void startBaking() {
		System.out.println("Knead the dough very lightly on a floured surface");
		
	}
	
	@Override
	public void setOvenTemp() {
		System.out.println("Grease the tray & set oven temperature to"+ getOvenTemp()+"C");
		
	}


	@Override
	public void bakeDecorator() {
		
		// TODO Auto-generated method stub
		
	}

}
