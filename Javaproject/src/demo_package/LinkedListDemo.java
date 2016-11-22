package demo_package;


import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		cities.add("London");
		cities.add("New Jercy");
		cities.add("Irvine");
		cities.add("LakeForest");
		
		for (String t : cities){
			System.out.println(t);
		}
		int x = cities.size();
		System.out.println("Size of the Array :" + x);
	}
	}


