package assignment1;
import assignment1.utility.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101,10000,"Mayur",12,12,2012);
		System.out.println(emp);
		Employee emp2 = new Employee();
		System.out.println(emp2);
		
		Person p1 = new Employee();
		System.out.println(p1);
		
		Person p2 = new Employee(101,10000,"Mayur",12,12,2012);
		System.out.println(p2);
		
	}

}
