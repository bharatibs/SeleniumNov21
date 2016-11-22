package demo_package;

public class Tickets {
	
	private double unDiscountedPrice;
	private double priceForSeniorCitizen;
	private double priceForChildren;
	
	public Tickets(double maxprice){
		unDiscountedPrice = maxprice;
		priceForSeniorCitizen = maxprice * 0.85;
		priceForChildren = maxprice * 0.5;
	}
	 
	public void printUnDiscountedPrice(){
		System.out.println(" Travel Ticket Price For Undiscounted = $"+ unDiscountedPrice );
	}
	public void printPriceForSeniorCitizen(){
		System.out.println(" Travel Ticket Price for Senior Citizen = $"+ priceForSeniorCitizen );
	}
	public void printunpriceForChildren(){
		System.out.println(" Travel Ticket Price for Children = $"+ priceForChildren );
	}
	
	
	public static void main(String[] args){
		Tickets ticketPrice = new Tickets(40.5);
	      
		ticketPrice.printUnDiscountedPrice();
		ticketPrice.printPriceForSeniorCitizen();
		ticketPrice.printunpriceForChildren();
	}

}
