package Lecture3;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue; // it skips the below line and move to the updation part
			}
			
			if(i == 7) {
				break; // it directly comes out of the loop
			}
			
			
			System.out.println(i);
			
//			if(i % 2 != 0) {
//				// kuch kaam nahikarna hai
//			} else {
//				System.out.println(i);
//			}
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
			
		}
	}

}
