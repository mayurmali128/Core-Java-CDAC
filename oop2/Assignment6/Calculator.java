class Calculator{
	private double n1,n2;

	public Calculator(){}
	public Calculator(double n1, double n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	public double add(){
		return n1+n2;
	}
	public double substract(){
		return n1-n2;
	}
	public double multiply(){
		return n1*n2;
	}
	public double division(){
		if(n2==0){
			System.out.println("n2 value cannot be 0");
			return -1;
		}
		return n1/n2;
	}	
}