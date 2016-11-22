package demo_package;


import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> td = new HashMap<>();
		td.put("Tim", 12345);
		td.put("Jon", 23456);
		td.put("Tom",78900);
		td.put("Jack",56789);
		
		for (Map.Entry m: td.entrySet()){
			System.out.println(m.getKey() + "-" + m.getValue());
		}
		

	}

}
