package assignment4;
import assignment1.Employee;

public class SalesManager extends Employee {
	private int target;
	private int incentive;
	
	public SalesManager() {
		super();
		target = incentive = 0;
	}
	
	public SalesManager(int target, int incentive,int empid , double salary, String name, int dd, int mm, int yy) {
		super(empid,salary,name,dd,mm,yy);
		this.target = target;
		this.incentive = incentive;
	}
	
	public String toString() {
		return super.toString()+"\n Target : "+ target + "\n Incentive: "+incentive;
	}
	
}
