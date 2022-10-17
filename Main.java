package miniprojekt2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Customer customer = new Customer();
		
		Item[] items = new Item[3];
		items[0] = new Item("Apple", 1, 10.99, 5);
		items[1] = new DiscountedItem("Grape", 2, 50, 8);
		items[2] = new Item("Watermelon", 3, 20.99, 2);
		
		while(true) {
			//Skriver ut menyn
			for(Item item: items) {
				System.out.println(item);
			}
			
			System.out.println("Enter 4 to quit");
			System.out.print("Enter item number to purchase: ");
			
			
			int customerNumber = scanner.nextInt();
			System.out.println();
			
			if (customerNumber == 4) {
				break;
			}
			
			
			
			Item item = items[customerNumber -1];
			item.reduceItem();
			
			customer.purchaseItem(item.getItemPrice());

		}
		
		System.out.println(customer);
		scanner.close();
	}
	
}


