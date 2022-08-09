package codePractise;

public class LongestPalindromSubstring {
	
	public boolean checkPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		LongestPalindromSubstring lps = new LongestPalindromSubstring();
		//System.out.println(lps.checkPalindrome("abaa"));
		String str = "bb";
		String longestPalidromSubstring = ""+str.charAt(0);
		for(int i=0;i<=str.length();i++) {
			for(int j=0;j<=str.length();j++) {
				if(i<=j) {
					//System.out.println(str.substring(0,1));
					if(lps.checkPalindrome(str.substring(i,j)) && ((str.substring(i,j)).length()>longestPalidromSubstring.length())) {
						longestPalidromSubstring=str.substring(i,j);
					}
				}
			}
		}
		System.out.println(longestPalidromSubstring);
	}

}



