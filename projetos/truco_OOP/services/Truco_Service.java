package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Truco_Service {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static boolean askTruco(boolean trucado, int valor) {
		
		if (valor != 1) {
			trucado = true;
			return trucado;
		}
		return trucado;
	}
	
	
	public static Integer truco(int decisionMachine,  boolean trucado) {
		
		Random random = new Random();
		decisionMachine = random.nextInt(3);
		
        	System.out.println("Do you want trucar?");
        	String decisionTruco = sc.next();
			if (decisionTruco.equals("yes")) {

	        	if (decisionMachine == 2) {
	                System.out.println("The machine offers 6");
	                System.out.println("Do you accept? Or you want to offers 9? (yes or no or 9)");
	                decisionTruco = sc.next();

	                if (decisionTruco.equals("9")) {
	                    decisionMachine = random.nextInt(2);
	                    if (decisionMachine == 2 ) {
	                        System.out.println("The machine offers 12");
	                        System.out.println("Do you accept? (yes or no)");
	                        decisionTruco = sc.next();

	                        if(decisionTruco.equals("yes")){
	                            return 12;
	                        }

	                    } else if (decisionMachine == 1) {
	                        System.out.println("The machine accepted");
	                        return 9;
	                    } else {
	                        System.out.println("The machine not accepted");
	                    }

	                } else if (decisionTruco.equals("yes")) {
	                    return 6;
	                }

	            } else if (decisionMachine == 1) {
	                System.out.println("The machine accepted");
	                return 3;
	            
	            } else {
	                System.out.println("The machine not accepted");
	            }
	        	
				}
			
				
			        return 1;

		
	}
	
}
