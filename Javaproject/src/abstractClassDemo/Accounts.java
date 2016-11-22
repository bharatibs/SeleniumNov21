package abstractClassDemo;

public class Accounts extends Employee{

	@Override
	public void message() {
		System.out.println("Accounts department will get an opportunity to work from home for 5 days a month");
		
	}
    public void message2(){
    	System.out.println("Accounts department will get 3 more days to work from home");
    }
}
