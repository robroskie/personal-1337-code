package Amazon;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class top_k_frequent_elements_347 {
    
	public static int[] topKFrequent(int[] nums, int k) {
		int[] toReturn = new int[k];

//		Create Hashmap where keys are the numbers and values are the counts
		Map<Integer, Integer> map = new HashMap<>();
		
//		Add the key value pairs to the hashmap - O(N) time
		for(int curNum : nums) {
			map.merge(curNum, 1, Integer::sum);
		}
	
		PriorityQueue<Integer> pQueue = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
		for(int currentNumber : map.keySet()) {
			pQueue.add(currentNumber);
		}
		
		for(int i = 0; i < k; i++) {
			toReturn[i] = pQueue.poll();
		}
		
		return toReturn;

	}
	public static void main(String[] args) {
		int[] nums = new int[] {1,1,1,2,2,3};
		int k = 2;
		
		int[] result = topKFrequent(nums, k);
		for(int i = 0; i < result.length; i++)
			System.out.print(result[i] + ", ");
	}
	
}
