public class Assignment8{
	public static void main(String[] args){
		int n = 2536;
		while(n>=10){
			int sum =0;
			while(n!=0){
				sum += n%10;
				n /= 10;
			}
			n = sum;
		}
		System.out.println("Digit sum is: " + n);
	}
}