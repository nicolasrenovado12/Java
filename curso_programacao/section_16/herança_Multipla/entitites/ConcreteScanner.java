package entitites;

public class ConcreteScanner extends Device implements Scanner{
	
	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("scanner processing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Scanned content";
	}

	

}
