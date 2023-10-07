package assignment2;

public class Customer {
	private String name;
	private Adress ad;
	
	public Customer() {
		name = "na";
		ad = new Adress();
	}
	
	public Customer(String name, int pincode, String area, String email) {
		this.name = name;
		ad = new Adress(pincode,area,email);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", ad=" + ad + "]";
	}
	
}
