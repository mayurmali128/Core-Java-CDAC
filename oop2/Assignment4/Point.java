class Point{
	int x,y;

	public Point(){}

	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Point(int k){
		x = y = k;
	}
	public void Display(){
		System.out.println("["+ x + "," + y + "]");
	}
	
	
}