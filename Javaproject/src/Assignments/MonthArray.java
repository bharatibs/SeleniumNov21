package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class MonthArray {
	
	public String month(int monthNum){
		String[] monthName = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		return monthName[monthNum -1];
		
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner monthNum = new Scanner(System.in);
		System.out.print("Enter month Number: ");
		int num = monthNum.nextInt();
		if (num<1 || num>12){
			System.out.print("Month "+ num + ":" + " ERROR");
		}
		else{
		MonthArray monthArray = new MonthArray();
		System.out.print("Month "+ num + ":" + monthArray.month(num));
		}
	}
   public String getMonthName(int monthNum){
	   ArrayList<String> arrayList = new ArrayList<>();
	   arrayList.add("January");
	   arrayList.add("February");
	   arrayList.add("March");
	   arrayList.add("April");
	   arrayList.add("May");
	   arrayList.add("June");
	   arrayList.add("July");
	   arrayList.add("August");
	   arrayList.add("September");
	   arrayList.add("October");
	   arrayList.add("November");
	   arrayList.add("December");
	   return arrayList.get(monthNum-1);
   }
}
