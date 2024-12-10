package banana;

public class CASA {

	public static void main(String[] args) {
		
		try {
			int a = 5;
			if (a == 4) {
				throw new Q("NÃO DEU BOM ");
			}
			
		} catch(Q e) {
			System.out.println(e);
		}
		
	}
}
