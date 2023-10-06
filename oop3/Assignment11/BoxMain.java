public class BoxMain{
	public static void main(String[] args){
		Box b1 = new Box();
		Box b2 = new Box(10,10,10);
		Box b3 = new Box(11.11);
		
		//Array of Box
		Box [] boxarr = {b1,b2,b3};
		for(int i=0; i<3; i++){
			System.out.println("Enter box "+(i+1)+ "data : ");
			boxarr[i].setData();
		}
		
		double max = boxarr[0].calculateVolume();

		for(int i=1; i<boxarr.length; i++){
			if(max<boxarr[i].calculateVolume()){
				max = boxarr[i].calculateVolume();
			}
		}
		System.out.println("Maximum volume:"+ max);
		
	}
}