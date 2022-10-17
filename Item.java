package miniprojekt2;

public class Item {

	private String itemName;
	private int itemNumber;
	private double itemPrice;
	private int quantity;
	
	Item(String itemName, int itemNumber,  double itemPrice, int quantity) {
		this.itemName = itemName;
		this.itemNumber = itemNumber;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}
	
	
	//getters n setters
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemName() {
		return itemName;
	}
	
	
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	
	
	public void reduceItem() {
		this.quantity--;
		}
		
	
	
	//toString
	public String toString() {
		return getItemNumber() + ". Buy " + getItemName() + ", $" + getItemPrice() + ", " + 
				  + getQuantity() + " left";
		
	}
}
