package demo_package;

public class swap_2numbers {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println("Before swapping:");
		System.out.println("num1 = " + num1 );
		System.out.println("num2 = " + num2 );
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping:");
		System.out.println("num1 = " + num1 );
		System.out.println("num2 = " + num2 );
		

	}

}
