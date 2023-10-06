public class BoxMain{
	public static void main(String[] args){
		Box b1 = new Box();
		Box b2 = new Box(10,10,10);
		Box b3 = new Box(11.11);
		
		//Array of Box
		Box [] boxarr = {b1,b2,b3};
		
		for(int i=0; i<boxarr.length; i++){
			System.out.println(boxarr[i].calculateVolume());
		}
		
	}
}