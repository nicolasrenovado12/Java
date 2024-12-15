package application;

import entitites.ComboDevice;
import entitites.ConcretePrinter;
import entitites.ConcreteScanner;

public class Herança_Multipla_174 {

	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.print("My letter");
		
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: "+ s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("MY dissertation");
		System.out.println("Scan result: " + c.scan());
	}
	
}
