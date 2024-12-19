package application;

import java.util.Map;
import java.util.TreeMap;

public class Program_189 {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("Username", "Maria");
		cookies.put("Email", "maria@gmail.com");
		cookies.put("Phone", "99711122");
		
		cookies.remove("Email");
		cookies.put("Phone", "99771133");
		
		System.out.println("Contais 'phone' key:  " + cookies.containsKey("Phone"));
		System.out.println("Phone number:  " + cookies.get("Phone"));
		System.out.println("Email:  " + cookies.get("Email"));
		System.out.println("Cookies size: " + cookies.size());
		System.out.println();
		System.out.println("All cookies: ");
		
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
	}
	
}
