public class MyNumbermain{
	public static void main(String[] args){
		MyNumber n1 = new MyNumber(-11);
		if(n1.isNegative()){
			System.out.println("The number is Negative.");
		}
		if(n1.isPositive()){
			System.out.println("The number is Positve.");
		}
		if(n1.isZero()){
			System.out.println("The number is Zero.");
		}
		if(n1.isEven()){
			System.out.println("The number is Even.");
		}
		if(n1.isOdd()){
			System.out.println("The number is Odd.");
		}
	}
}