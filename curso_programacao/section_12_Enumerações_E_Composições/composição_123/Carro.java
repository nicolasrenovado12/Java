package composição_123;

public class Carro {
	
	private String cor;
	private String marca;
	private Motor motor;
	
	public Carro(String cor, String marca, Motor motor) {
		this.cor = cor;
		this.marca = marca;
		this.motor = motor;
	}

	public String toString() {
		return "Carro [cor=" + cor + ", marca=" + marca + ", motor=" + motor.toString() + "]";
	}
	
	
	
	
	
}