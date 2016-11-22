package demo_package;

public class calculator {

	public void add(int a, int b){
		int sum = a + b;
		System.out.println("addition of a & b " + sum);
	}
	public void subtract(int a, int b){
		int sub = a - b;
		System.out.println("subtraction of a & b " + sub);
	}
	public void prod(int a, int b){
		int prod = a * b;
		System.out.println("multiplication of a & b " + prod);
	}
	public void devison(int a, int b){
		int divison = a / b;
		System.out.println("Division of a & b " + divison);
	}
	public static void main(String[] args) {
		calculator objectCal = new calculator();
		
		objectCal.add(5, 10);
		objectCal.subtract(20, 10);
		objectCal.prod(8, 9);
		objectCal.devison(100, 4);
	}

}
