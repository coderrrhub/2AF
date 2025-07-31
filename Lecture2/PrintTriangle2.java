package Lecture2;

public class PrintTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int space = N-1;
		int star = 1;
		int row = 1;
		while(row <= N) {
			int i = 1;
			while(i <= space) {
				System.out.print(" ");
				i++;
			}
			
			int j = 1;
			while(j <= star) {
				System.out.print("*");
				j++;
			}
			
			row++;
			space--;
			star++;
			System.out.println();
		}
	}

}
