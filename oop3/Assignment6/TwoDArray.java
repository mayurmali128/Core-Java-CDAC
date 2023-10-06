public class TwoDArray{
	public static void main(String [] args){
		int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{12,13,14,15}};
		
		int [] res1 = new int[4];
		int [] res2 = new int[4];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				res1[i] += arr[i][j];
			}
		}
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				res2[i] += arr[j][i];
			}
		}
		
		System.out.println("Rowise sum: ");
		for(int i=0; i<res1.length; i++){
			System.out.print(res1[i]+" ");
		}
		System.out.println();
		System.out.println("Columnwise sum: ");
		for(int i=0; i<res2.length; i++){
			System.out.print(res2[i]+" ");
		}
	}
}