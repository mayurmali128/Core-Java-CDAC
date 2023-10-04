public class Boxmain{
	public static void main(String[] args){
		Box b1 = new Box();
		System.out.println("Volume of a Box is: "+ b1.calculateVolume());
		Box b2 = new Box(10.5,10.11,10.2);
		System.out.println("Volume of a Box is: "+ b2.calculateVolume());
		Box b3 = new Box(11.11);
		System.out.println("Volume of a Box is: "+ b3.calculateVolume());
		
	}
}