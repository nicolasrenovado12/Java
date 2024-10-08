package section_7;

public class Funções_para_string_59 {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG  ";
		String so1 = original.toLowerCase();
		String so2 = original.toUpperCase();
		String so3 = original.trim();
		String so4 = original.substring(2);
		String so5 = original.substring(2, 10);

		String so6 = original.replace('a', 'x');

		
		System.out.println(so1);
		System.out.println(so2 + "-");
		System.out.println(so3 + "-");
		System.out.println(so4);
		System.out.println(so5);
		System.out.println(so6);
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]); // Print words!
		
		
		
		
	}
	
	
}
