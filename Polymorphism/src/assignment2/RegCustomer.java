package assignment2;

public class RegCustomer extends Customer{
	private int id;

	public RegCustomer() {
		super();
		id = 0;
	}

	public RegCustomer(int id, String name, int pincode, String area, String email) {
		super(name, pincode, area, email);
		this.id = id;
	}

	@Override
	public String toString() {
		return super.toString()+ "\n ID: "+ id;
	}

	

	
}
