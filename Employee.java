package Assignment2;
import java.util.*;
import java.text.DecimalFormat;
public class Employee extends PersonalCareShop{ //2.1 Inheritance
	
	protected String employeeName, position;	
	protected int employeeID;					
	protected double salary;		
	
	DecimalFormat df2 = new DecimalFormat("#.##");
	
	Scanner input = new Scanner(System.in);
	
	public Employee(String storeName, String phoneNumber, int yearEstablished) { // Constructor with three argument
		super(storeName, phoneNumber, yearEstablished);
		
		EmployeeInfo();
		
	}
	
	public void EmployeeInfo() {
		System.out.println("\n*******************************************" +
				"\n\tEmployee Information" +
				"\n*******************************************");
		System.out.print("Enter Your Name\t\t: ");
		this.employeeName = input.nextLine();		
		
		System.out.print("Enter Your EmployeeID   : ");
		this.employeeID = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter Your Position\t: ");
		this.position  = input.nextLine();
		
		System.out.print("Enter Your Salary\t: ");
		this.salary  = input.nextDouble();

		printInfo();
	  }
	
	public void printInfo () {//2.2 Polymorphism - method printInfo
		System.out.println("\n*******************************************" +
				"\n\tEmployee Information" +
				"\n*******************************************"+
				"\nName\t\t\t: " + getEmployeeName() +
				"\nPosition\t\t: " + getPosition() +
				"\nEmployee ID\t\t: " + getEmployeeID() +
				"\nSalary(per month)\t: RM" + df2.format(salary) +	
				"\n*******************************************");
	}
	
	//2.3 Encapsulation - Setter Methods
	public void setEmployeeName (String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void setEmployeeID (int employeeID) {
		this.employeeID = employeeID;
	}
	
	public void setPosition (String position) {
		this.position = position;
	}
	
	public void setSalary (double salary) {
		this.salary = salary;
	}
	
	//2.3 Encapsulation - Getter Methods
	public String getEmployeeName(){  
		return this.employeeName;
	}	
	
	public int getEmployeeID() {
		return this.employeeID;
	}					
	
	public String getPosition(){  
		return this.position;
	}
	
	public double getSalary(){ 
		return this.salary;
	}
	

}
