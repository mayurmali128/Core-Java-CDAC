import java.util.Scanner;
class Student{
	int rollno,nosub;
	String name;
	int [] arr;
	
	public Student(){
		rollno = nosub =0;
		name = "Default";
	}
	public void setData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name, rollno, number of subjects");
		name = sc.nextLine();
		rollno = sc.nextInt();
		nosub = sc.nextInt();
		System.out.println("Enter each subjects marks: ");
		arr = new int[nosub];
		for(int i=0; i<nosub; i++){
			System.out.println("Enter subject" +(i+1)+ " marks:");
			arr[i] = sc.nextInt();
		}
	}

	public void display(){
		System.out.println("Name: "+ name);
		System.out.println("Roll no: "+ rollno);
		System.out.println("No of Subjects "+ nosub);
		System.out.println("All Subjects marks: ");
		for(int i=0; i<nosub; i++){
			System.out.println("Subject" +(i+1)+ " marks:"+ arr[i]);
			
		}
	}
	
	public void calPer(){
		double sum = 0;
		for(int i=0; i<nosub; i++){
			sum += arr[i];
		}
		double res = sum/nosub;
		System.out.println("Name: "+ name);
		System.out.println("Percentage "+ res);
		
	}
	
}