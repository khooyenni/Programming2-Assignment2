package Assignment2;
import java.util.*;
public abstract class PersonalCareShop { //2.1 Inheritance & 2.4 Abstraction
	
	//1.2 Pre-Define Class
	protected String storeName, phoneNumber;  
	protected int yearEstablished;
	
	PersonalCareShop(String storeName, String phoneNumber, int yearEstablished){ //Constructor with three argument
		this.storeName = storeName;
		this.phoneNumber = phoneNumber;
		this.yearEstablished = yearEstablished;
		
		personalCareShopInfo();

	}
	
	public abstract void printInfo(); //2.2 Polymorphism - method printInfo
	
	public void personalCareShopInfo() {
		
		setstoreName("KYN Grocery Store");
		setYear(2021);
		setphoneNumber("016-7755324");
		
		System.out.println("*********************************************************************************"
				+ "\n\t\t\t\tGrocery Store Info"
				+ "\n*********************************************************************************"
				+"\nGrocery store name\t: "+getstoreName()
				+"\nYear established\t: "+getYear()
				+"\nContact number\t\t: "+getphoneNumber());
		
	}
	
	//2.3 Encapsulation - Setter Methods
	public void setstoreName(String storeName) {
		this.storeName=storeName;
	}
	
	public void setYear(int yearEstablished) {
		this.yearEstablished=yearEstablished;
	}
	
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	//2.3 Encapsulation - Getter Methods
	public String getstoreName() {
		return storeName;
	}
	
	public int getYear() {
		return yearEstablished;
	}

	public String getphoneNumber() {
		return phoneNumber;
	}
	
	//2.4 - Abstraction
	public abstract void EmployeeInfo(); //abstract method with no body

}
