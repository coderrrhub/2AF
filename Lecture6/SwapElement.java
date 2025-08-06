package Lecture6;

public class SwapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		
		swap2(arr, 0, arr.length-1); // call by reference
		
		
		System.out.println(arr[0]+"  "+arr[1]);
//		swap(arr[0], arr[1]); // call by value
//		System.out.println(arr[0] +"  "+arr[1]);
//		int a = 10;
//		int b = 20;
//		System.out.println(a+"  "+b); // 10 20
//		swap(a, b); // call by value
//		System.out.println(a+"  "+b); // 20 10
		
	
	}
	
	static void swap2(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
