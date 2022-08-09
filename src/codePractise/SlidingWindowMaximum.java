package codePractise;

//https://leetcode.com/problems/sliding-window-maximum/
//https://www.youtube.com/watch?v=CZQGRp93K4k

//Paused it , will revist later

public class SlidingWindowMaximum {
	
	//[1,3,-1,-3,5,3,6,7]==7 , 4 , 
	//
	
	public int[] firtSolution(int[] nums, int k) {
		int n = nums.length;
		int[] max = new int[n-k+1];
		for(int i=0;i<=(n-k);i++) {
			System.out.println("nums[i]"+nums[i]);
			int maxinK=nums[i];
			for(int j=1;j<i+k;j++) {
				//System.out.println("nums[j]"+nums[j]);
				if(nums[i+j]>maxinK) {
					maxinK=nums[i+j];
				}
				max[i]=maxinK;
				System.out.println("max[i]"+max[i]);
			}
			
		}
		return max;
	}
	
	// 1,-1    1
	public int[] optimumSolution(int[] nums, int k) {
		int[] finalArray=new int[nums.length-k+1]; 
		int currentMax = Integer.MIN_VALUE; 

		for(int i=0;i<nums.length;i++) { 
			if(nums[i]>=currentMax) { 
				System.out.print("Compare-i "+i);
				System.out.print(" Compare-nums " +nums[i]);
				currentMax=nums[i]; 
				System.out.print(" Compare-currentMax "+currentMax);
			}
			if(i>=k-1) {   
				System.out.print(" Greater than k i "+i);
				System.out.print(" currentMax "+currentMax);
				finalArray[i-(k-1)]=currentMax; 
				currentMax=nums[i-1];
				System.out.println(" nextCurrentMax "+currentMax);
			}
		}
		return finalArray;
	}
	
	
	public static void main(String[] args) {
		SlidingWindowMaximum test = new SlidingWindowMaximum();
		test.optimumSolution(new int[] {1,3,-1,-3,5,3,6,7}, 3);
	}

}
