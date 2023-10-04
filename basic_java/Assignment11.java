public class Assignment11{
	public static void main(String[] args){
		int n = 153;
		int res = 0;
		int temp =n;
		while(n!=0){
			int mod = n%10;
			n /= 10;
			res += (mod*mod*mod);
		}
		if(res ==temp){
			System.out.println("No is armstrong");
		}
		else{
			System.out.println("No is not armstrong");
		}
	}
}