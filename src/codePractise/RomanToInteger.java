package codePractise;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
    	int convertedInt=0;
    	Map<String,Integer> romanMap = new HashMap<String,Integer>();
    	romanMap.put("I", 1);
    	romanMap.put("V", 5);
    	romanMap.put("X", 10);
    	romanMap.put("L", 50);
    	romanMap.put("C", 100);
    	romanMap.put("D", 500);
    	romanMap.put("M", 1000);
    	String[] splitRoman = s.split("");
    	int previousVal=0;
    	for(int i=(splitRoman.length)-1;i>=0;i--) {
    		int currentRomanVal = romanMap.get(splitRoman[i]);
    		if(currentRomanVal<previousVal) {
    			convertedInt=convertedInt-currentRomanVal;
    		}else {
    			convertedInt=convertedInt+currentRomanVal;
    		}
    		previousVal=currentRomanVal;
    	}
    	return convertedInt;
        
    }
    
    public static void main(String[] args) {
		RomanToInteger rm = new RomanToInteger();
		System.out.println(rm.romanToInt("III"));
	}
}
