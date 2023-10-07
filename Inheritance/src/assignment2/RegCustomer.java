package assignment2;

public class RegCustomer extends Customer {
	private int id;

	public RegCustomer() {
		super();
		this.id = 0;
	}

	public RegCustomer(int id , String email, String adress) {
		super(email, adress);
		this.id = id;
	}
	
	public double giveDiscount(double amount){
		return amount-(amount*5/100);
	}
}
