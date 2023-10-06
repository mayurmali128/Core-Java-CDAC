class Account{
	private int ac;
	private double bal;
	private static float rate;
	private double sal;

	public Account(){}

	public Account(int ac, double bal, double sal){
		this.ac = ac;
		this.bal = bal;
		this.sal = sal;
	}

	public void Display(){
		System.out.println("AC: "+ ac);
		System.out.println("Bal; "+ bal);
	}

	static{
		rate = 8.94f;
	}

	public double calSalary(){
		return sal + (rate*sal/100);
	}
	
	public static void update(float r){
		rate = r;
	}

}