package Assignments;

import java.util.Scanner;

public class MonthSwitch {
	public String MonthNum(int num){
	String month;
		switch(num){
		case 1:
			  month = "January";
			  break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "Novermber";
			break;
		case 12:
			month = "December";
			break;
		default:
			month = "Error";
			break;
		}
		return month;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner monthNum = new Scanner(System.in);
		System.out.print("Enter month number: ");
		int num = monthNum.nextInt();
		MonthSwitch monthName = new MonthSwitch();
		System.out.println("Month " + num + " : "+monthName.MonthNum(num));

	}

}
