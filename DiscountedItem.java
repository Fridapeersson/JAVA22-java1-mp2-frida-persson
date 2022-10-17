package miniprojekt2;

public class DiscountedItem extends Item {
	
	public DiscountedItem(String itemName, int itemNumber,  double itemPrice, int quantity) {
		super(itemName,itemNumber, itemPrice, quantity);
	}

	 public double getItemPrice() {
	        return super.getItemPrice() - (super.getItemPrice() * 0.25);
	    }
	
	
	//toString
	public String toString() {
		return super.toString() + " (Discounted)";
	}

}


	
	

	
	


