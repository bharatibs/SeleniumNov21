package methodOverloading;

public class Printname {
	public void name(String fname){
	
	System.out.println("You have entered your name as" + "-"+ fname );	
	}
	
	public static void main(String[] args) {
		Printname ename = new Printname();
		ename.name("Bharati");
		ename.name("Ram");
		ename.name("Sham");
		ename.name("Steve");
		ename.name("Tim");
		ename.name("James");
		ename.name("Pizza");
		
	}

}
