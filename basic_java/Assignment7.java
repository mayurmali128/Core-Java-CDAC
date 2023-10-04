public class Assignment7{
	public static void main(String[] args){
		int n= 10;
		int first = 0;
		int second = 1;
		System.out.print(0+" , "+1);
		for(int i=3; i<=10; i++){
			int res = first+second;
			System.out.print(" , "+res);
			first = second;
			second = res;
		}
	}
}