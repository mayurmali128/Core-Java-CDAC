public class Assignment3{
	public static void main(String [] args){
		int n =5;
		long fact = 1L;
		for(int i=1;i<=n;i++){
			fact *= i;
		}
		System.out.println("Factorial of "+n+ " is:"+ fact);
	}
}