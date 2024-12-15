package entitites;

public abstract class Device {

	public String serialNumber;

	public abstract void processDoc(String doc);

	public Device(String serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}

}
