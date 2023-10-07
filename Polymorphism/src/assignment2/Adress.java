package assignment2;

public class Adress {
	private int pincode;
	private String Area;
	private String Email;
	
	public Adress() {
		pincode = 0;
		Area = "NA";
		Email = "NA";
	}
	
	public Adress(int pincode, String area, String email) {
		super();
		this.pincode = pincode;
		Area = area;
		Email = email;
	}

	@Override
	public String toString() {
		return "\nAdress [pincode=" + pincode + ", Area=" + Area + ", Email=" + Email + "]";
	}
	
	
	
	
}
