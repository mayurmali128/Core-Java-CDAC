import java.util.Scanner;
class Box{
	private double l,b,h;
	
	public Box(){
	}
	
	public Box(double l, double b, double h){
		this.l = l;
		this.b = b;
		this.h = h;
	}
	
	public Box(double x){
		l = b = h = x;
	}
	
	public double calculateVolume(){
		return l*b*h;
	}
	
	public void setData(){
		System.out.println("Enter length, breadth and height: ");
		Scanner sc = new Scanner(System.in);
		l = sc.nextDouble();
		b = sc.nextDouble();
		h = sc.nextDouble();
	}
	
}