package demo_package;

import java.util.ArrayList;


public class ArryaListDemo {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
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
