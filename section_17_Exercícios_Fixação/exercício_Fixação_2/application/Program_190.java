package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Program_190 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, Integer> results = new HashMap<>();
		Set<String> names = null;
		List<String> namesList = new ArrayList<>();
		List<Integer> votesList = new ArrayList<>();
		List<Integer> votosTotal = new ArrayList<>();
		List<String> namesReal = new ArrayList<>();
		System.out.print("Enter full file path: ");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			names = new HashSet<>();
			while (line != null) {

				String[] a = line.split(",");

				String name = a[0];
				int votes = Integer.parseInt(a[1]);
				namesList.add(name);
				votesList.add(votes);

				names.add(name);

				System.out.println(a[0]);
				line = br.readLine();
			}

			System.out.println(names);

			for (String g : names) {
				results.put(g, 0);
				votosTotal.add(0);
				namesReal.add(g);
			}

			for (int i = 0; i < namesList.size(); i++) {
				for (int e = 0; e < namesReal.size(); e++) {
					if (namesReal.get(e).equals(namesList.get(i))) {
						votosTotal.set(e, votosTotal.get(e) + votesList.get(i));
					}
				}

			}
			for (int q = 0; q < namesReal.size(); q++) {
				results.put(namesReal.get(q), votosTotal.get(q));
				System.out.println(namesReal.get(q) + ":  " + results.get(namesReal.get(q)));
			}

		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}

	}

}
