package application;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Program_181 {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStr = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStr);
	}

	public static void printList(List<?> list) {
		for (Object a : list) {
			System.out.println(a);
		}

	}

}
