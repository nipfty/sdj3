package Model;

public class Car {

	
	

	private String vin;
	private double weight;
	private String name;
	
	
	public Car(String vin, double weight, String name) {
		this.vin =vin ;
		this.weight = weight;
		this.name = name;
		
	}
	public String getVin() {
		return vin;
	}


	public double getWeight() {
		return weight;
	}


	public String getName() {
		return name;
	}

	
}