package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class fruit_into_baskets_904 {
	public static int totalFruit(int[] fruits) {

		Map<Integer, Integer> map = new HashMap<>();

		int left = 0;

		int maxFruits = 0;
		
		int currFruits = 0;
		
		for (int right = 0; right < fruits.length; right++) {
			System.out.println("left: " + left + " right: " + right + " maxFruits; " + maxFruits);

			currFruits++;
			map.merge(fruits[right], 1, Integer::sum);

			
			while(map.size() > 2 && left <= right) {

				map.put(fruits[left], map.get(fruits[left]) - 1);
			
				
				if(map.get(fruits[left]) == 0) 
					map.remove(fruits[left]);
				
				currFruits--;	
				left++;
			}
			
			System.out.println("left: " + left + " right: " + right + " maxFruits; " + maxFruits);
			maxFruits = Math.max(currFruits, maxFruits);
			System.out.println("left: " + left + " right: " + right + " maxFruits; " + maxFruits);
			
			System.out.println(map + "\n");
		}
		

		
		
		return maxFruits;
	}

	public static void main(String[] args) {
//		System.out.println(totalFruit(new int[] {0,1,2,2}));
//		System.out.println(totalFruit(new int[] {1,2,1}));
//		
		System.out.println(totalFruit(new int[] {3,3,3,1,2,1,1,2,3,3,4}));

	}
}
