package assignment1;

public class Employee extends Person {
	private int empid;
	private double salary;
	
	public Employee() {
		super();
		this.empid = 0;
		this.salary = 0;
	}
	
	public Employee(int empid , double salary, String name, int dd, int mm, int yy) {
		super(name,dd,mm,yy);
		this.empid = empid;
		this.salary = salary;
	}
	
	public void display() {
		super.display();
		System.out.println("Empid: "+ empid);
		System.out.println("Salary: "+ salary);
	}
}
