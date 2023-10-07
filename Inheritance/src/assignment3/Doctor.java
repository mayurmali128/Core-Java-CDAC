package assignment3;
import assignment1.Person;

public class Doctor extends Person{
	private String degree;
	private int regNo;
	private double sal;
	
	public Doctor() {
		super();
		this.degree = "NA";
		this.regNo = 0;
		this.sal = 0;
	}
	
	public Doctor(String name, int dd, int mm, int yy,String degree, int regNo, double sal) {
		super(name, dd, mm, yy);
		this.degree = degree;
		this.regNo = regNo;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Degree: "+ degree + "\n Reg No: "+ regNo + "\n Salary: "+ sal ;
	}
	
}
