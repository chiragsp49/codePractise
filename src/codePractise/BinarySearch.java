package codePractise;

//https://leetcode.com/problems/binary-search/submissions/
public class BinarySearch {
	public int search(int[] nums, int target) {
        int n = nums.length;
        int index =-1;
        for(int i=0;i<n;i++) {
        	if(nums[i]==target) {
        		index = i;
        		break;
        	}
        }
        return index;
    }
	
	public int optimalBinarySearch(int[] nums, int target) {
		int left =0;
		int right=nums.length-1;
		
		while(left<=right) {
			int pivot = left+(right-left)/2;
			if(nums[pivot]==target) { return pivot;}
			if(target<nums[pivot]) {
				right=pivot-1;
			}else {
				left=pivot+1;
			}
		}
		return -1;
	}
}
