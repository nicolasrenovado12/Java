package application;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Program_Reduce {

	public static void main(String[] args) {
		List<Integer> inteiros = Arrays.asList(3, 4, 5, 6, 2, 9);
		int somaLista = (inteiros.stream().reduce((x, y) -> x + y)).get();
			
		System.out.println("Lista: ");
		inteiros.forEach(System.out::println);
		System.out.print("Soma desta lista: " + somaLista);
		
	}
	
}
 