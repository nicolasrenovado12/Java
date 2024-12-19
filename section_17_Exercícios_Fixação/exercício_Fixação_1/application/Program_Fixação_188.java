package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Course;

public class Program_Fixação_188 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Course> a = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int studentsCourseA = sc.nextInt();
		for(int i=0; i<studentsCourseA; i++) {
			a.add(new Course(sc.nextInt()));
		}
		System.out.print("How many students for course B? ");
		int studentsCourseB = sc.nextInt();
		for(int i=0; i<studentsCourseB; i++) {
			a.add(new Course(sc.nextInt()));
		}
		System.out.print("How many students for course C? ");
		int studentsCourseC = sc.nextInt();
		for(int i=0; i<studentsCourseC; i++) {
			a.add(new Course(sc.nextInt()));
		}
		
		Set<Course> d = new HashSet<>(a);
		a.retainAll(d);
		System.out.println("Total students: " + d.size());
		
		
		
		
		
		
		
		sc.close();
	}
	
	
}
