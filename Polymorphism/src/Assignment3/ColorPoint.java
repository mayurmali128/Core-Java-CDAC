package Assignment3;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {}
	
	public ColorPoint(String color, int x, int y) {
		super(x,y);
		this.color = color;
	}
	
	public String toString() {
		return super.toString()+"\n Color of a point: "+color; 
	}
}
