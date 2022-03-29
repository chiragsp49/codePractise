package codePractise;

import java.util.Arrays;
import java.util.Scanner;



/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

public class MonkAndRotation {
	public static void main(String args[]) throws Exception{
        Scanner s = new Scanner(System.in);
        String testCases = s.nextLine();
        String NK=s.nextLine();
        String nIntegers=s.nextLine();
        
        
        String N = NK.split(" ")[0];
        String K = NK.split(" ")[1];
        String[] nArray = nIntegers.split(" ");
        
        int tempArrayLen = Integer.parseInt(N)-Integer.parseInt(K);
        String[] tempArray = new String[tempArrayLen];
        String[] finalArray = new String[Integer.parseInt(N)-tempArrayLen];
        
        int j=0;
        for(int i=0;i<Integer.parseInt(N);i++) {
        	if(i<tempArrayLen) {
        		tempArray[i]=nArray[i];
        	}else {
        		finalArray[j] = nArray[i];
        		j++;
        	}
        }
        
        String[] both = Arrays.copyOf(finalArray, finalArray.length + tempArray.length);
        System.arraycopy(tempArray, 0, both, finalArray.length, tempArray.length);
        
        for(int i=0;i<both.length;i++) {
        	System.out.print(both[i]);
        	if(i<both.length-1)
        		System.out.print(" ");
        }
       //System.out.println(Arrays.toString(both));
        
        
        
        
	}
}
