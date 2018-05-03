package PaintPaint;


// <<Attributes>>
public class Paint { 
	
	public String type;
	public int litres;
	private double price;
	private double size;
	
	
//<<<<<Constructor>>>>
	public Paint (String type, int litres,double price, double size) {
		
		this.type=type;
		this.litres=litres;
		this.setPrice(price);
		this.setSize(size);
		
	}
	
//<<<<<Methods>>>>
	public void name() {
		
	}

	

	/*getters & setters*/
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}
	
	
	
	
	

}
