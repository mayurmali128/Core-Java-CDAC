class Abc{
	private int k;
	
	//private constructer
	private Abc(int k){
		this.k = k;
	}
	static public Abc Call(int k){
		return new Abc(k);
	}
	public void Display(){	
		System.out.println("K : "+ k);
	}
}

public class Practice{
	public static void main(String [] args){
		Abc obj1 = Abc.Call(10);
		Abc obj2 = Abc.Call(11);
		obj1.Display();
		obj2.Display();
	}
}