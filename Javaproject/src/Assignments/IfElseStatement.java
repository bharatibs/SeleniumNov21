package Assignments;

import java.util.Scanner;

public class IfElseStatement {
    
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner age_input = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age = age_input.nextInt();
		
		if (age < 16) 
		   System.out.println("You Can't Drive");
		else if ((age >=16) && (age <=17))
			System.out.println("You can drive but not vote");
		else if((age >= 18) && (age <=24))
			System.out.println("You can vote but not rent a car");
		else 
			System.out.println("You can to do pretty much anything");
			
	}

}
