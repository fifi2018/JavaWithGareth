package DecoPattern;

abstract public class Baking {
	
	private String bakeName;
	private String ingredients;
	private double ovenTemp;

	public Baking(String bakeName, String ingredients, double ovenTemp) { //<< Constructor>>
		
		this.bakeName=bakeName;
		this.ingredients=ingredients;
		this.ovenTemp=(ovenTemp);
		
	}

   abstract public void startMixingIngredients(); //abstract 
   abstract public void startBaking(); //abstract 
   abstract public void setOvenTemp();
   
   public void bakeDecorator() {
	// TODO Auto-generated method stub
	
}
   
	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String recipe) {
		this.ingredients = recipe;
	}


	public String getBakeName() {
		return bakeName;
	}


	public void setBakeName(String bakeName) {
		this.bakeName = bakeName;
	}


	public double getOvenTemp() {
		return ovenTemp;
	}


	public void setOvenTemp(int ovenTemp) {
		this.ovenTemp = ovenTemp;
	} 
	
	
	
	
	
	
	
	
	

}
