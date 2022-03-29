package codePractise;

public class FibinaaciSeries { //
	static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	
	
	public static void printFibonnacci(int n) {
		int n1=0 , n2=1,n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) {
		//System.out.println(fib(9));
		printFibonnacci(10);
	}
}
