package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

	private List<Integer> list = new ArrayList<Integer>();
	
	public void addValue(Integer value) {
		list.add(value);
	}
	
	public Integer first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i=1; i<list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
		
	}
	
}
