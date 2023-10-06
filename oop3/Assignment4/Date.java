class Date{
	private int dd, mm, yy;
	private static int cnt;

	public Date(){
		cnt++;
	}
	public Date(int dd, int mm, int yy){
		cnt++;
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public void display(){
		System.out.println(dd +" / "+mm+ " / "+yy);
	}
	public static int getCount(){
		return cnt;
	}

}