package assignment1;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.display();
		
		System.out.println("------------------------------------------------------------------------");
		
		Employee e2 = new Employee(101,100000,"Mayur",23,5,2002);
		e2.display();
		System.out.println("------------------------------------------------------------------------");
		
		Person p1 = new Person("Mayur",23,5,2002);
		p1.display();
		
		System.out.println("------------------------------------------------------------------------");
		
		//Assignment2
		Person p3 = new Employee(102,1500000,"Krishna",12,3,2001);
		p3.display();
		System.out.println("------------------------------------------------------------------------");
	}
}
