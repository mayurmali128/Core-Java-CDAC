public class BookMain{
	public static void main(String [] args){
		Book b1 = new Book();
		b1.Display();
		Book b2 = new Book(1000);
		b2.Display();
		Book b3 = new Book(150);
		b3.Display();
	}
}