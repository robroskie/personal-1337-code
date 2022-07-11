package Solns;

public class squares_of_a_sorted_array_977 {

    public static int[] sortedSquares(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		
		int[] toReturn = new int[nums.length];
		
		int idx = nums.length - 1;
		
		while(left <= right) {
			if(Math.pow(nums[left], 2) < Math.pow(nums[right], 2)) {
				toReturn[idx] = (int)Math.pow(nums[right], 2);
				right--;
			}
			else {
				toReturn[idx] = (int)Math.pow(nums[left], 2);
				left++;
			}
			idx--;
		}
		return toReturn;
    }
}
	
	public static void main(String[] args) {
		int[] a = sortedSquares(new int[] {-7,-3,2,3,11});
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
