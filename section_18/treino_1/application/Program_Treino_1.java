package application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program_Treino_1 {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.iterate(2, x -> x * 2);
		List<Integer> list = stream.limit(20).collect(Collectors.toList()); 
		System.out.println(list);
		
	}
	
	
}
