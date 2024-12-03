package banana;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Truco {

	public static void main(String[] args) {
		
		Random rand = new Random();
		List<String> cartas = new ArrayList<>();
		String[] cartasVetor =  {"4 - paus", "4 - espadas", "4 - copas", "4 - ouros"};
		for(String i : cartasVetor) {
			System.out.println(i);
			cartas.add(i);
		}
		List<String> cartasUsuario = new ArrayList<>();
		
		for(int i=3; i>0; i-=1) {
			int a = rand.nextInt(0, i);
			cartasUsuario.add(cartas.get(a));
			cartas.remove(a);
			
		}
		
		
		
		System.out.println(cartasUsuario);
	}
	
}
