package demo_package;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
		cities.add("London");
		cities.add("New Jercy");
		cities.add("Irvine");
		cities.add("LakeForest");
		cities.add("Irvine");
		
		for (String t : cities){
			System.out.println(t);
		}
		int x = cities.size();
		System.out.println("Size of the Array :" + x);
	}

}
