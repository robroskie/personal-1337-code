package Amazon;

public class product_of_array_except_self_238 {
    public  static int[] productExceptSelf(int[] nums) {
    	int[] toReturn = new int[nums.length];
    	toReturn[0] = 1;
    	// Set the starting value
    	
    	int right = 1;
    	
        // Calculate the products left of each of the elements up to but not including i, and store at position i in the output array 
    	for(int i  = 1; i < nums.length; i++) {
    		toReturn[i] = toReturn[i - 1] * nums[i - 1];
    		System.out.print(toReturn[i] + ", ");
    	}
    	
    	
    	
    	for(int i = nums.length - 1; i >= 0; i--) {
    		toReturn[i] *= right;
    		right *= nums[i];
    	}
    	
    	return toReturn;
    }
    
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};
		
		productExceptSelf(arr);
	}
}
