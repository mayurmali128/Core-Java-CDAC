public class Assignment10{
	public static void main(String [] args){
		int p =1;
		int n =4;
		for(int i=0; i<n; i++){
			for(int j=0; j<i+1; j++){
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}
	}
}