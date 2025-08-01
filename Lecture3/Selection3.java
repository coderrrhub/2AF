package Lecture3;

public class Selection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 18;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println(max);
		int age = 18;
		int val = 2;
		// store kar sakta hai
		System.out.println((age >= 18) ? "Helllo": "World");
		if(age >= 18) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}
	}

}
