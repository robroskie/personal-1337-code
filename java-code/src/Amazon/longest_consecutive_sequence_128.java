package Amazon;

import java.util.Arrays;

public class longest_consecutive_sequence_128 {
	public static void main(String[] args) {
		int[] nums = {1,2,0,1};
//		
//		if(nums.lengh == 0) {
//			return 0;
//		}
//        if(nums.length == 1)
//            return 1;
        
        Arrays.sort(nums);
        
        int longest = 1;
        int count = 1;
        
        for(int i = 0; i < nums.length - 1; i++){
        	System.out.println("loop");
            if(nums[i + 1] == nums[i] + 1){
                count++;    
                System.out.println("count++");
            }
            else if(nums[i + 1] == nums[i])
            	continue;
            else{
                count = 1;
                System.out.println("count = 1");
            }
            longest = Math.max(longest, count);
        }
        
        System.out.println(longest);
        
	}
}
