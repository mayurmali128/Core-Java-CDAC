package office.utility;
public class Date{
	private int dd,mm,yy;
	
	public Date(){
	}
	public Date(int dd, int mm, int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public Date(Date d){
		this.dd = d.dd;
		this.mm = d.mm;
		this.yy = d.yy;
	}
	public void Display(){
		System.out.println(dd+" / "+mm+" / "+yy);
	}
}