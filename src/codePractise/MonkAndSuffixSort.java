package codePractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MonkAndSuffixSort {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 String sampleInput = s.nextLine();
		 String[] inputArray = sampleInput.split(" ");
		 String sample=inputArray[0];
		 List<String> sampleSet = new ArrayList<String>();
		 //int j=0;
//		 for(int i=(inputArray.length);i>=0;i--){
//			 inputArray[i-1]
//		     
//		 }
		 int startInt = Integer.parseInt(inputArray[1]);
		 for(int i=startInt;i>=0;i--) {
			 sampleSet.add(sample.substring(i));
			 
		 }
		 
		 Collections.sort(sampleSet);
		 System.out.println(sampleSet.get(2));
		 
	}
}
