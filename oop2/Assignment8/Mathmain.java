public class Mathmain{
	public static void main(String [] args){
		Math m1 = new Math();
		System.out.println("Addition is : "+ m1.add(10,20));
		System.out.println("Addition is : "+ m1.add(10,20,30));
		System.out.println("Addition is : "+ m1.add(10.5f,20.5f));
		System.out.println("Addition is : "+ m1.add(10,20.5f,30.676));
	}
}