package Assignment2;
import java.text.DecimalFormat;
import java.util.*;
public abstract class Inventory { //2.1 Inheritance & 2.4 Abstraction
	
	protected String itemCode, itemName;
	protected int itemQuantity;	
	protected double itemPrice; 
	
	DecimalFormat df2 = new DecimalFormat("#.##");
	
	Scanner input = new Scanner(System.in);
	
	public Inventory() { //constructor with no arguments
		
		RegisterNewItem();
		
	}

	public abstract void printInfo(); //2.2 Polymorphism - method printInfo
	
	public void RegisterNewItem() {
		System.out.println("*********************************************************************************"
				+ "\n\t\t\t\tRegister New Item"
				+ "\n*********************************************************************************");
		System.out.print("Enter Item Name Purchased\t: ");
		this.itemName = input.nextLine();
		System.out.print("Enter Item Code Purchased\t: ");
		this.itemCode = input.nextLine();
		System.out.print("Enter Item Price Purchased\t: ");
		this.itemPrice = input.nextDouble();
		System.out.print("Enter Quantity Purchased\t: ");
		this.itemQuantity = input.nextInt();
		
		System.out.println("\nNew item has been registered."
				+"\nItem name\t\t: " + getItemName()
				+"\nItem code\t\t: " + getItemCode()
				+"\nItem Price\t\t: RM " + df2.format(getItemPrice())
				+"\nQuantity\t\t: " + getItemQuantity()
				+"\nTotal Price Purchase\t: RM " + df2.format(TotalPricePurchase()));
	}
	
	//2.3 Encapsulation - Setter Methods
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public void setItemPrice (double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	//2.3 Encapsulation - Getter Methods
	public String getItemName() {
		return this.itemName;
	}
	
	public String getItemCode() {
		return this.itemCode;
	}
	
	public int getItemQuantity() {
		return this.itemQuantity;
	}
	
	public double getItemPrice() {
		return this.itemPrice;
	}
	
	public double TotalPricePurchase() {//Method to get the total price of all inventory stock
		return this.itemQuantity * this.itemPrice;
	}
	

}
