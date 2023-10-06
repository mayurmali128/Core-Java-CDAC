public class DateMain{
	public static void main(String[] args){
		Date d1 = new Date();
		Date d2 = new Date(10,12,2023);
		Date d3 = new Date(11,12,2023);
		d1.display();
		d2.display();
		d3.display();
		System.out.println("Total number of date classes created: "+ Date.getCount());
	}
}