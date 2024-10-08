package listas_Parte_2_99;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa_Lista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list.add("Tengo");
		list.add("Lengo");
		list.add("CHEGO");
		
		
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		int a = list.indexOf(sc.next());
		
		System.out.println(a);
		
		int id = list2.get(a);
		
		System.out.println(id);
		
		
		
		
		
		
		
		for(String x : list) {
			System.out.println(x);
		}
	}
	
}
