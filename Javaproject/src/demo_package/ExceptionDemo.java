package demo_package;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner  k = new Scanner(System.in);
		try{
		System.out.println("Please Enter One Number");
		int number1 = k.nextInt();
		
		System.out.println("Please Enter One Number");
		int number2 = k.nextInt();
		
		System.out.println("Result of Division of 2 numbers :" + number1/number2);
		}
		
		catch(ArithmeticException a){
			System.out.println("Please don't enter Zero in the denominator");
		}
		
		catch(InputMismatchException I){
			System.out.println("Please Enter integers, other type of inputs are not valid");
			
		}
		catch(Exception e){
			System.out.println("Intput Type is not valid");
		}
		
		

	}

}
