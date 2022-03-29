package codePractise;

public class SwapTwoNumbersWithoutThird {
	public static void main(String[] args) {
		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a is "+a+" and value of b is "+b);
	}
}
