package codePractise;

//https://www.youtube.com/watch?v=y2BD4MJqV20&t=4s
//https://leetcode.com/problems/longest-palindromic-substring/
public class LongestPalindromSubstringOptimalSol {
	
	public String longestPalindrome(String s) {
		if(s == null || s.length() < 1) return "";
		
		int start=0;
		int end=0;
		
		for(int i=0;i<s.length();i++) {
			System.out.print("i is "+i+"\t");
			System.out.print("start is "+start+"\t");
			System.out.println("end is "+end+"\t");
			int len1=expandFromMiddle(s,i,i);
			int len2=expandFromMiddle(s,i,i+1);
			System.out.print("len1 is "+len1+"\t");
			System.out.print("len2 is "+len2+"\t");
			int len = Math.max(len1, len2);
			System.out.println("len is "+len+"\t");
			
			if( len > end -start) {
				start = i -((len-1)/2);
				end = i+ (len/2);
			}
			System.out.println("final start is "+start+"\t");
			System.out.println("final end is "+end+"\t");
			System.out.println("----------------");
		}
		return s.substring(start,end+1);
	}
	
	public int expandFromMiddle(String s , int left, int right) {
		if(s == null || left>right) return 0;
		
		while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
			System.out.println("Inside While \t");
			System.out.println("Inside While char at left is "+s.charAt(left)+"\t");
			System.out.println("Inside While char at left is "+s.charAt(right)+"\t");
			left--;
			right++;
		}
		System.out.println("Inside While right is"+ right+" \t");
		System.out.println("Inside While left is"+ left+" \t");
		System.out.println("Inside While ( right - left -1) is"+ (right - left -1)+" \t");
		return right - left -1;
	}
	
	public static void main(String[] args) {
		LongestPalindromSubstringOptimalSol lpsos = new LongestPalindromSubstringOptimalSol();
		System.out.println(lpsos.longestPalindrome("cbbd"));
	}
	
}
