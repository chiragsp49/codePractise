package codePractise;

import java.util.Scanner;

class MinimumANDxorOR {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		String testCases = s.nextLine();
		for (int i = 0; i < Integer.parseInt(testCases); i++) {
			String numOfItems = s.nextLine();
			String arrayString = s.nextLine();
			 String[] nArray = arrayString.split(" ");
			 Integer minNumber = Integer.parseInt(nArray[0])^Integer.parseInt(nArray[1]);
			// System.out.println("min Number"+minNumber);
			for(int j=0;j<Integer.parseInt(numOfItems);j++) {
				//Do XOR of two number 
				//System.out.println("Test J"+nArray[j]);
				for(int k=1;k<Integer.parseInt(numOfItems);k++) {
					//System.out.println("Test K "+nArray[k]);
					if((minNumber > (Integer.parseInt(nArray[j])^Integer.parseInt(nArray[k]))) && j!=k){
					
						minNumber = Integer.parseInt(nArray[j])^Integer.parseInt(nArray[k]);
						
					}
				}
			}
			System.out.println(minNumber);
		}
	}
}
