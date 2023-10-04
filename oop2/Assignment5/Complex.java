class Complex{
	private int img, real;
	
	public Complex(){};
	public Complex(int real, int img){
		this.img = img;
		this.real = real;
	}

	public void Display(){
		if(this.img>=0){
			System.out.println("Complex no: "+this.real + "+" + this.img+"i");
		}
		else{
			System.out.println("Complex no: "+this.real+ this.img + "i");
		}
	}
}