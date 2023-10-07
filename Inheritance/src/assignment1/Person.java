package assignment1;

import assignment1.utility.Date;

public class Person {
	private String name;
	private Date bdate;
	public Person() {
		name = "default";
		bdate = new Date();
	}
	public Person(String name, int dd, int mm, int yy) {
		super();
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}
	
	public void display() {
		System.out.println("Name: "+ this.name);
		System.out.println("Birth date: ");
		bdate.Display();
	}
	@Override
	public String toString() {
		return "\n Name: "+name + "\n Birth date: "+ bdate.toString();
	}
	
	
}
