package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entitite.LogEntry;

public class Program_187 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file full path: ");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Set<LogEntry> set = new HashSet<>();
			String line = br.readLine();

			while (line != null) {

				String[] a = line.split(" ");

				set.add(new LogEntry(a[0], Date.from(Instant.parse(a[1]))));

				line = br.readLine();
			}
			System.out.println("Total Users: " + set.size());

		} catch (IOException e) {
			System.out.println("IOException error: " + e.getMessage());
		}
		sc.close();
	}

}
