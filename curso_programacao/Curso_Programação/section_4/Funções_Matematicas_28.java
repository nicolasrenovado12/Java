package section_4;

import java.util.Scanner;

public class Funções_Matematicas_28 {

	public static void main(String[] args) {
		
		double x;
		double y;
		double z;
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
		x = Math.sqrt(x);
		y = Math.pow(y, y);
		z = Math.abs(z);
		
		
		System.out.println("Números racionais formatados: \n x: "+ x + "\n y: " + y + "\n z: " + z);
		
		
		
	}
	
	
}
