class Line{
	private Point sp,ep;
	
	
	public Line(){
		sp = new Point();
		ep = new Point();
	}
	
	public Line(int x1, int y1, int x2, int y2){
		sp = new Point(x1,y1);
		ep = new Point(x2,y2);
	}
	
	public void display(){
		System.out.println("Starting point: ");
		sp.Display();
		System.out.println("Ending point: ");
		ep.Display();
	}
		
}