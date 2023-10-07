package assignment2;

public class Customer {
	private String email, adress;

	public Customer() {
		super();
		this.email = "Defualt";
		this.adress = "NA";
	}

	public Customer(String email, String adress) {
		super();
		this.email = email;
		this.adress = adress;
	}
	
	public double giveDiscount(double amount){
		return amount;
	}
	
	public void setData(String email, String Adress) {
		this.email = email;
		this.adress = Adress;
	}
}
