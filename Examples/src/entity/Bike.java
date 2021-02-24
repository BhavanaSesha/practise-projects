package entity;


public class Bike implements Comparable<Bike> {
	private String make;
	private String model;
	private String type;
	private String engineCC;
	private long price;
	public Bike() {
		super();
	}
	public Bike(String make, String model, String type, String engineCC, long price) {
		super();
		this.make = make;
		this.model = model;
		this.type = type;
		this.engineCC = engineCC;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [make=" + make + ", model=" + model + ", type=" + type + ", engineCC=" + engineCC + ", price="
				+ price + "]";
	}

	public int compareTo(Bike bike)
	{
		return (int)(this.make.compareTo(bike.make));
		
	}


	

}
