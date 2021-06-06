package Assignment2;
import java.util.*;
public abstract class ProductDescription{ //Supper class of customer
	
	protected String itemCode, itemCategory;
	
	public ProductDescription(String itemCode, String itemCategory) { //Constructor with two argument
		this.itemCode=itemCode;
		this.itemCategory=itemCategory;	
	}
	
	//2.3 Encapsulation - Setter Methods
	public void setItemCode(String itemCode) {
		this.itemCode=itemCode;
	}
		
	public void setItemCategory(String itemCategory) {
		this.itemCategory=itemCategory;
	}	
		
	//2.3 Encapsulation - Getter Methods
	public String getItemCode(){ 
		return this.itemCode;
	}					
		
	public String getItemCategory(){  
		return this.itemCategory;
	}
		
	public void printInfo(){ //2.2 Polymorphism - method printInfo
	setItemCategory("Cosmetic");
	setItemCode("PC-230");
	System.out.println("\n*******************************************" +
			"\n\t\tProduct Categories" +
			"\n*******************************************"+
			"\nYou Have Choose "+ getItemCategory() + " Products." +
			"\nYou have choose "+ getItemCode() );
				
	if (getItemCategory() == "Cosmetic") {
		if (getItemCode() == "PC-230") {
			Eyebrow();
		}else if (getItemCode() == "PC-350") {
			Mascara();
		}else if (getItemCode() == "PC-400") {
			Brush();
		}
	}else if(getItemCategory() == "Shampoo"){
		if (getItemCode() == "PS-110") {
			Rejoice();
		}else if(getItemCode() == "PS-115") {
			Sunsilk();
		}else if(getItemCode() == "PS-118") {
			Pantene();
		}
	}	
	}
	
	public void Eyebrow(){
		System.out.println("\n********************Details of Product********************");
		System.out.println("ItemNumber\t: PC-230");               
		System.out.println("ItemName\t: Kate Eyebrow Colour 3D");
		System.out.println("ItemBrand\t: Kate Kyoto");
		System.out.println("ItemColour\t:Natural Brown");
		System.out.println("ItemPrice\t: RM34.40");
		System.out.println("ItemNetWeight\t: 6.3gram");
		System.out.println(" **********************************************************");
		System.out.println();
		
	}

	public void Mascara(){
		System.out.println("\n********************Details of Product********************");
		System.out.println("ItemNumber\t: PC-350");
		System.out.println("ItemName\t: 3CE Eyebrow Mascara");
		System.out.println("ItemBrand\t: 3CE");
		System.out.println("ItemColour\t: Gold Brown");
		System.out.println("ItemPrice\t: RM41.00");
		System.out.println("ItemNetWeight\t: 5.5gram");
		System.out.println(" **********************************************************");
		System.out.println();
		
	}
	
	public void Brush(){
		System.out.println("\n********************Details of Product********************");
		System.out.println("ItemNumber\t: PC-400");
		System.out.println("ItemName\t: Tail Lasting Brush Liner");
		System.out.println("ItemBrand\t: Holika Holika");
		System.out.println("ItemFlavour\t: Real Black");
		System.out.println("ItemPrice\t: RM49.90");
		System.out.println("ItemNetWeight\t: 0.5gram");
		System.out.println(" **********************************************************");
		System.out.println();
		
	}
	
	public void Rejoice(){
		System.out.println("\n********************Details of Product********************");
		System.out.println("TypeItemNumber\t: PS-110");
		System.out.println("ItemName\t: Rejoice Frizz Repair Shampoo");
		System.out.println("ItemBrand\t: Rejoice");
		System.out.println("ItemPrice\t: RM12.50");
		System.out.println("ItemNetWeight\t: 340ml");
		System.out.println(" **********************************************************");
		System.out.println();
	}	
	
	public void Sunsilk(){
		System.out.println("\n********************Details of Product********************");
		System.out.println("TypeItemNumber\t: PS-115");
		System.out.println("ItemName\t: Sunsilk Super Collagen Shampoo Power Shine");
		System.out.println("ItemBrand\t: Sunsilk");
		System.out.println("ItemPrice\t: RM26.90");
		System.out.println("ItemNetWeight\t: 380ml");
		System.out.println(" **********************************************************");
		System.out.println();
	}
	
	public void Pantene(){
		System.out.println("\n********************Details of Product********************");
		System.out.println("TypeItemNumber\t: PS-118");
		System.out.println("ItemName\t: Pantene Pro-V Anti Dandruff Shampoo");
		System.out.println("ItemBrand\t: Pantene");
		System.out.println("ItemPrice\t: RM15.90");
		System.out.println("ItemNetWeight\t: 340ml");
		System.out.println(" **********************************************************");
		System.out.println();
	}
	
	//2.4 - Abstraction
	public abstract void OrderItem(); //abstract method with no body

}
