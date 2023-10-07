package assignment4;
import assignment1.Employee;

public class Admin extends Employee {
	private int bonus;
	
	public Admin() {
		super();
		bonus= 0;
	}
	
	public Admin(int bonus,int empid , double salary, String name, int dd, int mm, int yy) {
		super(empid,salary,name,dd,mm,yy);
		this.bonus = bonus;
	}
	
	public String toString() {
		return super.toString()+"\n Bonus : "+ bonus;
	}
}
