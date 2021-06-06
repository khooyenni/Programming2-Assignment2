package Assignment2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Customer extends ProductDescription implements Payment{ //2.1 Inheritance

	protected String customerName, address, phoneNumber;
	protected int quantityItem, orderItem;
	protected double price;
	
	DecimalFormat df2 = new DecimalFormat("#.##");
	
	Scanner input = new Scanner(System.in);
	public Customer(String itemCode, String itemCategory){ //Constructor with two argument
		super(itemCode, itemCategory);
		super.printInfo();
		System.out.print("\nDo you want to order online? (Y/N):");
		char online = input.next().charAt(0); 
		input.nextLine();
		
		if (online == 'Y'){
			System.out.print("Enter Your Name\t\t: ");
			this.customerName = input.nextLine();	
				
			System.out.print("Enter Your Phone Number : ");
			this.phoneNumber = input.nextLine();
				
			System.out.print("Enter Your Address\t: ");
			this.address = input.nextLine();
			
			printInfo();
			OrderItem();
		}
		else {
			OrderItem();
		}
	}
		
	public void printInfo() {//2.2 Polymorphism - method printInfo
		System.out.println("\n*********************************************************************************"
				+ "\n\t\t\t\tCustomer Information"
				+ "\n*********************************************************************************"
				+ "\nCustomer Name \t:" + getCustomerName()
				+ "\nPhone Number \t:" + getphoneNumber()
				+ "\nAddress \t:" + getAddress());
		System.out.println();
	}
		
	public void OrderItem() {//abstract method from super class with body
		System.out.println("Please enter the item you want to purchase:");
		System.out.println("**************************************************************" +
				"\n1. PC-230  Kate Eyebrow Colour 3D                     RM34.40" +
				"\n2. PC-350  3CE Eyebrow Mascara                        RM41.00" +
				"\n3. PC-400  Holika Holika Tail Lasting Brush Liner     RM49.90" +
				"\n4. PS-110  Rejoice Frizz Repair Shampoo 3D            RM12.50" +
				"\n5. PS-115  Sunsilk Super Collagen Shampoo Power Shine RM26.90" +
				"\n6. PS-118  Pantene Pro-V Anti Dandruff Shampoo        RM15.90" +
				"\n7. End" +
				"\n**************************************************************");		
		System.out.println();
    
		System.out.print("Enter Item Number You want to Purchase  : ");
		orderItem = input.nextInt();
		
		switch (orderItem) {
		
		case 1:
			setPrice(34.30);
			System.out.print("Enter the Quantity You want to Purchase : ");
	    	this.quantityItem= input.nextInt();
			System.out.println("\nThe Item You Want to Purchase    : Kate Eyebrow Colour 3D");
			System.out.println("The Quantity You Want to Purchase: " + quantityItem );
	    	System.out.println("The Total Price\t\t\t : RM" + df2.format(getPayment()));
	    	System.out.println();
	    	break;
	    	
		case 2:
			setPrice(41.00);
			System.out.print("Enter Quantity:");
	    	this.quantityItem= input.nextInt();
			System.out.println("The Item You Want to Purchase    : 3CE Eyebrow Mascara ");
			System.out.println("The Quantity You Want to Purchase: " + quantityItem );
	    	System.out.println("The Total Price\t\t\t : RM" + df2.format(getPayment()));
	    	System.out.println();
			break;
			
		case 3:
			setPrice(49.90);
			System.out.print("Enter Quantity:");
	    	this.quantityItem= input.nextInt();
			System.out.println("The Item You Want to Purchase    : Holika Holika Tail Lasting Brush Liner ");
			System.out.println("The Quantity You Want to Purchase: " + quantityItem );
	    	System.out.println("The Total Price\t\t\t : RM" + df2.format(getPayment()));
	    	System.out.println();
			break;
			
		case 4:
			setPrice(12.50);
			System.out.print("Enter Quantity:");
	    	this.quantityItem= input.nextInt();
			System.out.println("The Item You Want to Purchase    : Rejoice Frizz Repair Shampoo 3D ");
			System.out.println("The Quantity You Want to Purchase: " + quantityItem );
	    	System.out.println("The Total Price\t\t\t : RM" + df2.format(getPayment()));
	    	System.out.println();
			break;
			
		case 5:
			setPrice(26.90);
			System.out.print("Enter Quantity:");
	    	this.quantityItem= input.nextInt();
			System.out.println("The Item You Want to Purchase    : Sunsilk Super Collagen Shampoo Power Shine ");
			System.out.println("The Quantity You Want to Purchase: " + quantityItem );
	    	System.out.println("The Total Price\t\t\t : RM" + df2.format(getPayment()));
	    	System.out.println();
			break;
			
		case 6:
			setPrice(15.90);
			System.out.print("Enter Quantity:");
	    	this.quantityItem= input.nextInt();
			System.out.println("The Item You Want to Purchase    : Pantene Pro-V Anti Dandruff Shampoo");
			System.out.println("The Quantity You Want to Purchase: " + quantityItem );
	    	System.out.println("The Total Price\t\t\t : RM" + df2.format(getPayment()));
	    	System.out.println();
			break;
			
		case 7:
			System.out.println("Thank you for shopping at KYN Grocery Store");
		
	}
		
	
	}
	
	public double totalPrice() {
		return this.quantityItem * this.price;
	}
	
	//2.3 Encapsulation - Setter Methods
	public void setCustomerName (String customerName) {
		this.customerName = customerName;
	}
	
	public void setphoneNumber (String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress (String address) {
		this.address = address;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	//2.3 Encapsulation - Getter Methods
	public String getCustomerName() {
		return this.customerName;
	}
	
	public String getphoneNumber() {
		return this.phoneNumber;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	//2.5 - Interface
	public double getPayment() {
		return totalPrice();
	}

}
