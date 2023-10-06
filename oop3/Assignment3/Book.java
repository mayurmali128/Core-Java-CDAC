class Book{
	private int id;
	private float price;
	private static int cnt;
	Book(){
		cnt++;
		id = cnt;
	}
	Book(float price){
		cnt++;
		this.price = price;
		id = cnt;
	}
	void Display(){
		System.out.println("ID: "+ id);
		System.out.println("Price: "+ price);
	}
}