package ex1student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex1App {
	public static void main(String[] args) {
//		Map<String, Customer> map = new HashMap<String, Customer>();
//        Map<String, Customer> map = new LinkedHashMap<String, Customer>();
        Map<String, Customer> map = new TreeMap<String, Customer>();

		map.put("11111111", new Customer("11111111", "12121212", "Bob", "Kennedy"));
		map.put("22222222", new Customer("22222222", "23232323", "Alice", "Gordon"));
		map.put("77777777", new Customer("77777777", "78787878", "Burt", "Cassidy"));
		map.put("44444444", new Customer("44444444", "45454545", "John", "Farmer"));
		map.put("88888888", new Customer("88888888", "89898989", "George", "Smith"));

		//Nedenstående virker for alle 3 maps

		System.out.println(map.get("11111111"));
		System.out.println(map.get("22222222"));
		System.out.println(map.get("77777777"));
		System.out.println(map.get("44444444"));
		System.out.println(map.get("88888888"));
		System.out.println();

		for (Map.Entry mp : map.entrySet()) {
			System.out.println("Key: " + mp.getKey() + " Value: " + mp.getValue());
		}
		System.out.println(map.keySet());


	}
}
