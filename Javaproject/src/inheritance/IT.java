package inheritance;

public class IT extends Employee {
    int bonus = 5000;
    int sal = 8000;
	public static void main(String[] args) {
		IT jon = new IT();
		System.out.println(" Total salary = " +(jon.sal + jon.bonus ));
	}

}
