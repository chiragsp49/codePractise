package codePractise;

//https://leetcode.com/problems/product-of-array-except-self/
//https://www.youtube.com/watch?v=tSRFtR3pv74
public class ProductOfArrayExceptSelf {
	
	public int[] productExceptSelfWithDivision(int[] nums) {
		int[] product = new int[nums.length];
		int allProduct = 1;
		for(int i=0;i<nums.length;i++) {
			allProduct = allProduct*nums[i];
			
		}
		
		for(int i=0;i<nums.length;i++) {
			product[i]=allProduct/nums[i];
		}
        return product;
    }
	
	public int[] productExceptSelfWithoutDivision(int[] nums) {
		int N = nums.length;
		
		int[] left_product = new int[N];
		int[] right_product = new int[N];
		int[] output_arr = new int[N];
		left_product[0]=1;
		right_product[N-1]=1;
		
		for(int i=1;i<N;i++) {
			left_product[i]=left_product[i-1]*nums[i-1];
		}
		
		for(int i=N-2;i>=0;i--) {
			right_product[i]=right_product[i+1]*nums[i+1];
		}
		
		for(int i=0;i<N;i++) {
			output_arr[i]=left_product[i]*right_product[i];
		}
		return output_arr;
	}
	
	public static void main(String[] args) {
		ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
		int[] input = {1,2,3,4};
		int[] finalResult = productOfArrayExceptSelf.productExceptSelfWithDivision(input);
		for(int i=0;i<finalResult.length;i++) {
			System.out.println(finalResult[i]);
		}
	}	
}
