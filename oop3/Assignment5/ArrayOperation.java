public class ArrayOperation{
	private static int findMax(int [] arr){
		int maxi = arr[0];
		for(int i=1;i<arr.length; i++){
			if(maxi<arr[i]){
				maxi = arr[i];
			}
		}
		return maxi;
	}
	
	private static int findMin(int [] arr){
		int mini = arr[0];
		for(int i=1;i<arr.length; i++){
			if(mini>arr[i]){
				mini = arr[i];
			}
		}
		return mini;
	}

	private static double findAvg(int [] arr){
		double sum =0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		return sum/arr.length;

	}

	public static void main(String[] args){
		int [] arr = {10,34,65,70,12,14,56};

		System.out.println("Maximum element is: "+ findMax(arr));
		System.out.println("Minimum element is: "+ findMin(arr));
		System.out.println("Average of elements is: "+ findAvg(arr));
	}
}