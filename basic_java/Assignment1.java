public class Assignment1{
	public static void main(String[] args){
		int n = 17;
		boolean flag = true;
		for(int i=2; i<n; i++){
			if(n%i==0){ 
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("The number is prime.");
		}
		else{
			System.out.println("The number is not prime");
		}
		
	}
}