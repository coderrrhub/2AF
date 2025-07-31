package Lecture2;

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int row = 1;
		while(row <= N) {
			int i = 1;
			while(i <= row) {
				System.out.print("*");
				i++;
			}
			
			System.out.println();
			row++;
		}
	}

}
