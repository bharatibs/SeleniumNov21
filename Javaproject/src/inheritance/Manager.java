package inheritance;

public class Manager extends Employee {
    int bonus = 6000;
    int sal = 10000;
	public static void main(String[] args) {
	    Manager kim = new Manager();
		System.out.println("Total Salary = " + (kim.sal + kim.bonus) );

	}

}
