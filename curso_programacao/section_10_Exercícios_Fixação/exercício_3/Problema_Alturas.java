package exercício_3;

import java.util.Scanner;

import exercício_2.Object;

public class Problema_Alturas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sumHeight = 0;
		int teenPeoples = 0;

		String teenPeoplesNames = " ";
		
		People p = new People();
		
		System.out.println("how many people you type? ");
		int n = sc.nextInt();
		p.names = new String[n];
		p.ages = new int[n];
		p.heights = new double[n];
		
		double averageHeight = 0;
		
		for (int i=0; i<n; i++) {
			
			System.out.println(i+1 + "People: ");
			
			String name = sc.next();
			int age = sc.nextInt();
			double height = sc.nextDouble();
			p.names[i] = name;
			p.ages[i] = age;
			p.heights[i] = height;
					
			
			
		}
		
		for (int i=0; i <n; i++) {
			averageHeight += p.heights[i];

			if (p.ages[i] < 16) {
				teenPeoples = teenPeoples + 1;
				teenPeoplesNames = teenPeoplesNames + p.names[i];
			}
			
		}
		double percentage = p.percentage(teenPeoples);
		
		System.out.println("Average height: " + averageHeight / n);
		System.out.println("Teen peoples: " + percentage + "%");
		sc.close();
		
	}

}
