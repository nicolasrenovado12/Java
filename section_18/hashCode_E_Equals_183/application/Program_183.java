package application;

import entities.Client;

public class Program_183 {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "teste";
		String s2 = "teste";
		String s3 = new String("teste");
		String s4 = new String("teste");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);


		
		
			
	}

}
