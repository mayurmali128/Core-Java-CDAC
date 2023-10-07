package assignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		while(true) {
			System.out.println("Are you want to continue:\n Press 1 for continue \n Press 0 for exit");
			int ch = sc.nextInt();
			
			if(ch==0) {
				break;
			}
			Customer c1;
	//		System.out.println("Enter you name: ");
//			Scanner sc  = new Scanner(System.in);
			System.out.println("Please enter your name: ");
			String name = sc.nextLine();
			
			sc.nextLine();
			System.out.println("Please enter your adress: ");
			String adress = sc.nextLine();
			
			System.out.println("Enter cutomer type \n 1. Regular \n 2. New");
			int type = sc.nextInt();
			
			if(type ==1) {
				System.out.println("Please enter your ID: ");
				int id = sc.nextInt();
				
				System.out.println("Please enter your Amount: ");
				double amount = sc.nextDouble();
				c1 = new RegCustomer(id,name,adress);
				System.out.println("You got 5% discount.");
				System.out.println("Your total amount is "+ c1.giveDiscount(amount));
			}
			else if(type==2) {
				System.out.println("Please enter your Amount: ");
				double amount = sc.nextDouble();
				c1 = new Customer(name,adress);
				System.out.println("Discount not applicable.");
				System.out.println("Your total amount is "+ c1.giveDiscount(amount));
			}
//			sc.close();
		}
		sc.close();
	}

}
