public class Check{
	private static boolean checkUniq(int []arr){
		for(int i=0; i<arr.length; i++){
			int num = arr[i];
			for(int j=i+1; j<arr.length; j++){
				if(num==arr[j])
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		int [] arr = {1,2,4,5,6};
		
		if(checkUniq(arr)){
			System.out.println("All elements are unique.");
		}
		else{
			System.out.println("All elements are not unique.");
		}
	}
}