package Assignment2;
import java.text.DecimalFormat;
import java.util.*;
public class Finance extends Inventory implements Payment{ //2.1 Inheritance
	
	protected double income, salary, TotalPricePurchase, incidentalCharges, totalProfit;		
	
	DecimalFormat df2 = new DecimalFormat("#.##");
	
	Scanner input = new Scanner(System.in);
	public Finance() {	//Constructor with no argument
		
		System.out.print("\nEnter Income Grocery\t\t: ");												
		this.income = input.nextDouble();		
				
		System.out.print("Enter Total Salary\t\t: ");												
		this.salary = input.nextDouble();
				
		System.out.print("Enter Incidental Charges\t: ");											
		this.incidentalCharges = input.nextDouble();

		printInfo();
	}
	
	public void printInfo() {//2.2 Polymorphism - method printInfo
		System.out.println();
		System.out.println("\n********************************************************************"
				+ "\n\t\t\tFinance Report"
				+ "\n********************************************************************"
				+ "\nTotal Income\t\t\t\t\t\tRM "+ df2.format(getTotalIncome())
				+ "\nTotal Salary Employee\t\t\t\t\tRM "+df2.format(getTotalSalary())
				+ "\nTotal Price Purchase Inventory\t\t\t\tRM " + df2.format(TotalPricePurchase())
				+ "\nIncidental Charges\t\t\t\t\tRM "+ df2.format(getIncidentalCharges())
				+ "\nTotal payment of the month\t\t\t\tRM " + df2.format(getPayment())
				+"\n____________________________________________________________________"
				+"\nTotal Profit\t\t\t\t\t        RM " + df2.format(totalProfit()) 
				+ "\n********************************************************************");
	    System.out.println();
	}

	//2.3 Encapsulation - Setter Methods
	public void setTotalIncome(double income) {
		this.income = income;
	}
	
	public void setTotalSalary(double salary) {
		this.salary = salary;
	}
	
	public void setIncidentalCharges(double incidentalCharges) {
		this.incidentalCharges = incidentalCharges;
	}
	
	//2.3 Encapsulation - Getter Methods
	public double getTotalIncome() { 
		return this.income;
	}
	
	public double getTotalSalary() { 
		return this.salary;
	}
	
	public double getIncidentalCharges() { 
		return this.incidentalCharges;
	}
	
	public double TotalPricePurchase() {//Method to get the total price of all inventory stock
		return super.TotalPricePurchase();
	}
	
	public double totalProfit() {//Method to get the total profit
		return this.income -(this.salary + TotalPricePurchase() +this.incidentalCharges);
	}
	
	//2.5 - Interface
	public double getPayment() { 
		return super.TotalPricePurchase() + getIncidentalCharges() + getTotalSalary();
	}
	
}
