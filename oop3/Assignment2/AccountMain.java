public class AccountMain{
	public static void main(String [] args){
		Account a1 = new Account(101,1024000,500000);
		a1.Display();
		System.out.println("Calculated salary: "+ a1.calSalary());
		Account.update(8.99f);
		System.out.println("Calculated salary: "+ a1.calSalary());
		//Account a2 = new Account();
		//a2.Display();
	}
}