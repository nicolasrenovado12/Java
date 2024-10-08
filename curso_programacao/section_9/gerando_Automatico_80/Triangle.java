package gerando_Automatico_80;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}



	public double area() {
		double p = (a + b + c) / 2.0;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		return area;
		
	}
	
	
}
