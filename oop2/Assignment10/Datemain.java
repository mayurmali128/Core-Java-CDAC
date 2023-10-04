public class Datemain{
	public static void main(String [] args){
		Date Date = new Date();	
		Date.Display();
		Date d2 = new Date(10,12,2023);
		d2.Display();
		Date d3 = new Date(d2);
		d3.Display();
		
		d3.Display('-');
	}
}