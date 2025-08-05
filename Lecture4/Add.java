package Lecture4;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
//		int sum = a + b;
		System.out.println(addTwoNo(a, b));
		
		int x = 200;
		int y = 500;
//		int sum1 = x + y;
		System.out.println(addTwoNo(x, y));
		System.out.println("Hellooo");
	}
	
	static int addTwoNo(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
