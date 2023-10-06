package office.staff;
import office.utility.Date;
public class Person{
	private String name;
	private Date bdate;
	
	public Person(){
		name = "Default";
		bdate = new Date();
	}
	public Person(String name, int d, int m, int y){
		this.name = name;
		bdate = new Date(d,m,y);
	}
	public void display(){
		System.out.println("Name: " + name);
		System.out.println("Date of Birth: ");
		bdate.Display();
	}
}