package assignment4;
import assignment1.Employee;
public class Main {

	public static void main(String[] args) {
		Employee []arr = new Employee[3];
		
		arr[0] = new SalesManager(50000,2000,101,10000,"SalesManager",12,12,2012);
		arr[1] = new Programmer(2,2000,101,10000,"Programmer",11,12,2012);
		arr[2] = new Admin(2000,101,10000,"Admin",11,12,2012);
		
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}
	}

}
