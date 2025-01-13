package application2;

import java.sql.Connection;
import java.util.HashSet;
import java.util.Set;

import entities2.Client_2;

public class Program_Set {

	public static void main(String[] args) {

		Connection conn = buced.getConnection();
		
		Set<Client_2> set = new HashSet<>();
		
		set.add(new Client_2("Nicolas", 15));
		
		Client_2 a = new Client_2("Nicolas", 15);
		
		System.out.println(set.contains(a));
		
	}

}
