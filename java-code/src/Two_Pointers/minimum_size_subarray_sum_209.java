package Two_Pointers;

public class minimum_size_subarray_sum_209 {
	
    public static int minSubArrayLen(int target, int[] nums) {
    	int left = 0;
    	int min = nums.length + 1;
    	int sum = 0;
    	
    	for(int right = 0; right < nums.length; right++) {
    		sum += nums[right];
    		
    		while(sum >= target) {
    			min = Math.min(right - left + 1, min);
    			sum -= nums[left];
    			left++;
    		}
    	}
    	if(min == nums.length + 1)
            return 0;
    	return min;
    	
    }
	
	
	public static void main(String[] args) {
//
//		int target = 7;
//		int[] nums = {2,3,1,2,4,3};
//		
//		System.out.println(minSubArrayLen(target, nums));
//		
//		System.out.println("\n\n");
//		
//		int target1 = 4;
//		int[] nums1 = {1,4,4};
//		System.out.println(minSubArrayLen(target1, nums1));
//		
//		System.out.println("\n\n");
		
		
		int target2 = 15;
		int[] nums2 = {1,2,3,4,5};
		System.out.println(minSubArrayLen(target2, nums2));
		
		
	}

}
