package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program_184 {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");	
		set.add("Notebook");
		
		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}
	}
}
