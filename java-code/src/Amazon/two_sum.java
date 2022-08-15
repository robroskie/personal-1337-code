package Amazon;

public class two_sum {
	public static void main(String[] args) {
		int[] nums = { 3, 4, 2, 6, 1, 2 };

		boolean sorted = false;

		int temp;

		while (!sorted) {
			sorted = true;
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] > nums[i + 1]) {
					temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
					sorted = false;
				}
			}
		}
		
		int left = 0;
		int right = nums.length - 1;
		
		while(left < right) {
			if((nums[left] + nums[right]) == target)
				return new int[] {left, right};
			else if((nums[left] + nums[right] < target)
					left++;
			else
				right++;
			
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		

	}
}
