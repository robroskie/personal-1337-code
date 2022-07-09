package Solns;

public class squares_of_a_sorted_array_977 {

    public static int[] sortedSquares(int[] nums) {
		int left = (int)Math.floor(nums.length / 2);
		int right = (int)Math.floor(nums.length / 2);
		System.out.println(left);
		
		int[] toReturn = new int[nums.length];
		
		toReturn[left] = nums[left];
		
		left--;
		right++;
		
		int count = 1;
		
		while(left > 0 && right < nums.length) {
			int leftTemp = (int) Math.pow(2, nums[left]);
			int rightTemp = (int) Math.pow(2, nums[right]);
			
			if(nums[leftTemp] < nums[rightTemp]) {
				toReturn[count] = 
			}
			
		}
    }
	
	public static void main(String[] args) {
		sortedSquares(new int[] {-7,-3,2,3,11});
	}
}
