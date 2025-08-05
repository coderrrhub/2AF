package Lecture5;

public class BostonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 378;
		int sum1 = sumOfDigit(n);
		int sum2 = 0;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				// i is the factor of n
				while(n % i == 0) {
					sum2 += sumOfDigit(i);
					n = n / i;
				}
			}
		}
		
		
		
		
		
		
//		for(int i = 1; i <= n; i++) {
//			if(n % i == 0 && isPrimeNo(i)) {
//				// i is the factor of n
//				int cnt = countNoOfTimes(n, i);
//				int sumDig = sumOfDigit(i);
//				sum2 = sum2 + (cnt * sumDig);
//			}
//		}
		
		System.out.println(sum1 +"  "+sum2);
		if(sum1 == sum2) {
			System.out.println("It is a Boston Number");
		} else {
			System.out.println("Not");
		}
	}
	
	static int countNoOfTimes(int n, int factor) {
		int cnt = 0;
		while(n % factor == 0) {
			n = n / factor;
			cnt++;
		}
		
		return cnt;
	}
	
	static boolean isPrimeNo(int n) {
		if(n == 1) {
			return false;
		}
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	static int sumOfDigit(int n) {
		int sum = 0;
		while(n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		
		return sum;
	}

}
