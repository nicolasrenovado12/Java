package entities;

import java.util.Objects;

public class Client_2 {

	private String name;
	private int age;
	
	public Client_2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client_2 other = (Client_2) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	
}
