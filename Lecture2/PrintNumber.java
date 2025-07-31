package Lecture2;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int row = 1;
		while(row <= N) {
			int i = 1;
			while( i <= 5) {
				System.out.print(row);
				
				i++; // i = i + 1;
			}
			
			System.out.println();
			
			row++;
		}
	}

}
