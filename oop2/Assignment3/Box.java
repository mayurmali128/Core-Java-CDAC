class Box{
	private double l,b,h;
	
	public Box(){
	}
	public Box(double l, double b, double h){
		this.l = l;
		this.b = b;
		this.h = h;
	}
	public Box(double x){
		l = b = h = x;
	}
	public double calculateVolume(){
		return l*b*h;
	}
	
}