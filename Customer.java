package miniprojekt2;

public class Customer {
	private int totalItemPurchased;
	private double total;
	
	
	Customer() {
		this.totalItemPurchased =  0;
		this.total = 0;
	}
	
	//setterNgetter metoder
	public void purchaseItem(double price) {
		total = total + price;
		this.totalItemPurchased++;
	}
	
	public int getTotalItemPurchased() {
		return totalItemPurchased;
	}
	
	public double getTotal() {
		return total;
	}
	
	//toString
	public String toString() {
		return "You purchased a total of: " + getTotalItemPurchased() + " items"
		+ "\nYour total is: $" + total;
	}
	
}
