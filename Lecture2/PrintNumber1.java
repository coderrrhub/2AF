package Lecture2;

public class PrintNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int row = 1;
		while(row <= N) {
			int i = 1;
			while( i <= 5) {
				System.out.print(i);
				
				i++; // i = i + 1;
			}
			
			System.out.println();
			
			row++;
		}
	}

}
