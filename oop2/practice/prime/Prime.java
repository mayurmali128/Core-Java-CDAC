public class Prime{

	public static boolean isPrime(int n){
		for(int i=2; i<n; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args){
		
		int cnt =0;
		for(int i=11; i<=100; i++){
			if(isPrime(i)){
				cnt++;
				System.out.println(i);
			}
		}
		System.out.println("Total count: "+ cnt);
	}
}