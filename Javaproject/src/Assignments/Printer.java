package Assignments;

public class Printer {

	public String printName(String name){
		return name;
	}
	public static void main(String[] args) {
		Printer pname = new Printer();
		System.out.println("You have entered your name as -" + " "+ pname.printName("Bharati"));		

	}

}
