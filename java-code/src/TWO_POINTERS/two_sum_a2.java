package TWO_POINTERS;

import java.util.HashMap;
import java.util.Map;

public class two_sum_a2 {

	public static int[] twoSum(int[] nums, int target) {
		int[] toReturn = new int[2];
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < nums.length; i++) {
			int searchVal = target - nums[i];
			
			if(map.containsKey(searchVal)) {
				toReturn = new int[] {map.get(searchVal), i};
				return toReturn;
			}
			map.put(nums[i], i);
		}
		return toReturn;
	}

	public static void main(String[] args) {
		int[] nums = {3,3};
		int target = 6;

		int[] result = twoSum(nums, target);
		
		for(int e : result) {
			System.out.print(e + ", ");
		}
	}

}
