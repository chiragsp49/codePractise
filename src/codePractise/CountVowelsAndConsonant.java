package codePractise;

public class CountVowelsAndConsonant {
	public static void main(String[] args) {
		String testString = "Count number of vowerls and consonants";
		int vowerlCounter = 0;
		int consonantCounter = 0;
		testString = testString.toLowerCase();
		for(int i=0;i<testString.length();i++) {
			if(testString.charAt(i)=='a' || testString.charAt(i)=='e' 
					|| testString.charAt(i)=='i' || testString.charAt(i)=='o' || testString.charAt(i)=='u') {
				vowerlCounter++;
			}else if(testString.charAt(i)>='a' && testString.charAt(i)<='z') {
				consonantCounter++;
			}
			
			
		}
		
		System.out.println("Vowerl Counter "+vowerlCounter);
		System.out.println("Consonant Counter "+consonantCounter);
	}
}
