package codePractise;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		for(int i=2;i<number;i++) {
			//System.out.println("i "+i);
			while(number%i==0) {
				System.out.println(i+" ");
				number = number/i;
			}
		}
		if(number>2) {
			System.out.println(number);
		}
	}
}
