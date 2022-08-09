package codePractise;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	//https://www.youtube.com/watch?v=3IETreEybaA
	//https://leetcode.com/problems/longest-substring-without-repeating-characters/
	public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int max =0;
        int a_pointer=0;
        int b_pointer=0;
        while(b_pointer<s.length()) {
        	if(!charSet.contains(s.charAt(b_pointer))) {
        		charSet.add(s.charAt(b_pointer));
        		b_pointer++;
        		max = Math.max(charSet.size(), max);
        	}else {
        		charSet.remove(s.charAt(a_pointer));
        		a_pointer++;
        	}
        }
        return max;
    }
	
	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println(test.lengthOfLongestSubstring("abcbefg"));
	}

}
