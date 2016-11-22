package Assignments;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random dice = new Random();
		
		int number1 = 1 +dice.nextInt(6);
		int number2 = 1 +dice.nextInt(6);
		int sum = number1 + number2;
		System.out.println("Sample OutPut 1-\n HERE COMES THE DICE");
		System.out.println("Roll #1 : " + number1);
		System.out.println("Roll #2 : " + number2);
		System.out.println("The Total is " + sum + "!");
		
		System.out.println("");
		
		int number3 = 1 +dice.nextInt(6);
		int number4 = 1 +dice.nextInt(6);
		int sum1 = number3 + number4;
		System.out.println("Sample OutPut 2-\n HERE COMES THE DICE");
		System.out.println("Roll #1 : " + number3 );
		System.out.println("Roll #2 : " + number4);
		System.out.println("The Total is " + sum1 + "!");
	}

}
