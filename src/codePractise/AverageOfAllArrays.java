package codePractise;

public class AverageOfAllArrays {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8};
		
		int arrayLength = array.length;
		int sum=0;
		for(int i=0;i<arrayLength;i++) {
			sum=sum+array[i];
		}
		
		System.out.println("Average is "+sum/arrayLength);
	}
}
