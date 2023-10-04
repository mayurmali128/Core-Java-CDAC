class MyNumber{
	private int n;
	
	public MyNumber(){}

	public MyNumber(int n){
		this.n = n;
	}
	
	boolean isNegative(){
		return n<0;
	}
	boolean isPositive(){
		return n>0;
	}
	boolean isZero(){
		return n==0;
	}
	boolean isEven(){
		return ((n&1) != 1);
	}
	boolean isOdd(){
		return ((n&1) == 1);
	}
}