package Assignment2;

public class AdvertisementAndMarketing {
	
	protected String promotion;
	
	public AdvertisementAndMarketing(String promo) { //Constructor with one argument
		this.promotion = promo;
		
		System.out.println("\n****************************************************************"
				+ "\n\t\tAdvertisement And Marketing"
				+ "\n****************************************************************");
		
		printInfo();
		socialMedia();
	}
	
	public void printInfo() {//2.2 Polymorphism - method printInfo
		System.out.println("\nPromotion is coming!!!"
				+ "\nFree lipstick for order over RM200."
				+ "\nFree return when receive the wrong items"
				+ "\nGet a 10% discount for your next purchase!");
	}
	
	
	public void socialMedia() {
		System.out.println("\nFollow us for more promotion!!!"
						 + "\nFacebook  : KYN Grocery Store" 
						 + "\nInstagram : @KYNGroceryStore"  
						 + "\nWebsite   : http://www.KYNGroceryStore.com.my");
	}
	
	//2.3 Encapsulation - Setter Methods
	public void setPromotion (String promo) {
		this.promotion = promo;
	}
	
	//2.3 Encapsulation - Getter Methods
	public String getPromotion() {
		return this.promotion;
	}

}
