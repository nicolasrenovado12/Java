package application;

import java.util.Arrays;
import java.util.List;

public class Program_Train {

	public static void main(String[] args) {

		List<Integer> myInts1 = Arrays.asList(1, 2, 3, 4);
		printNumbers(myInts1);

	}

	public static void printNumbers(List<? extends Number> list) {

		for (Number n : list) {
			System.out.println(n);
		}

	}

}
