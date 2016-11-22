package inheritance;

public class HR extends Employee {


int bonus = 4000;
public static void main(String[] args) {
	  HR tom = new HR();
	System.out.println("Total Salary = " + (tom.sal + tom.bonus) );
}
}
