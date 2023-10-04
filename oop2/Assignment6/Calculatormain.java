public class Calculatormain{


	public static void main(String[] args){
		Calculator c1 = new Calculator(20,10);
		System.out.println("Addition : " + c1.add());
		System.out.println("Substraction : " + c1.substract());
		System.out.println("Multiplication : " + c1.multiply());
		System.out.println("Division : "+ c1.division());
	}
}