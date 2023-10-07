package assignment4;
import assignment1.Employee;

public class Programmer extends Employee {
	private int hours;
	private int rate;
	
	public Programmer() {
		super();
		hours = rate = 0;
	}
	
	public Programmer(int hours, int rate,int empid , double salary, String name, int dd, int mm, int yy) {
		super(empid,salary,name,dd,mm,yy);
		this.hours = hours;
		this.rate = rate;
	}
	
	public String toString() {
		return super.toString()+"\n Extra hours : "+ hours + "\n Rate: "+rate;
	}
}
