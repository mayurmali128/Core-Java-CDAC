public class Assignment5{
	public static void main(String [] args){
		int k =9;
		int n = (k/2+1);
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i; j++){
				System.out.print("  ");
			}
			for(int j = i+1; j>=1; j--){
				System.out.print(j+" ");
			}
			for(int j = n+1; j<n+i+1; j++){
				System.out.print(j-(n-1)+" ");
			}
			System.out.println();
		}
		
	}
}