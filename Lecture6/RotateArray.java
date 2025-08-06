package Lecture6;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int k = 9;
		int len = arr.length;
		rotateArrayByK(arr, k);
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	
	static void rotateArrayByK(int[] arr, int k) {
		int len = arr.length;
		k = k % len;
		for(int j = 1; j <= k; j++) {
			int temp = arr[len-1];
			for(int i = len-2; i >= 0; i--) {
				arr[i+1] =  arr[i];
			}
			arr[0] = temp;
		}
	}

}
