package Solns;

import java.util.HashMap;
import java.util.Map;

public class fruit_into_baskets_904 {
	
    public static int totalFruit(int[] fruits) {
     
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int startWindow = 0;
    	int max = 0;
    	for(int endWindow = 0; endWindow < fruits.length; endWindow++) {
    		int key = fruits[endWindow];
    		map.merge(key, 1, Integer::sum);
    		System.out.println(map);
    		
    		while(map.size() > 2) {
    			int keyToRemove = fruits[startWindow];
    			
    			System.out.println("map.size() = " + map.size());
    			System.out.printf("removing key %d\n\n", keyToRemove);
    			
    			map.put(keyToRemove, map.get(keyToRemove) - 1);
    			if(map.get(keyToRemove) == 0) {
    				System.out.println("deleting" + keyToRemove);
    				map.remove(keyToRemove);
    			}

    			startWindow++;
    		}
    		max = Math.max(max, endWindow - startWindow + 1);
    	}
    	

    	return max;
    }
	
	public static void main(String[] args) {
//		int[] test1 = {1,2,3,2,2};
//		System.out.println(totalFruit(test1));
		int[] test2 = {0,1,2,2};
		System.out.println(totalFruit(test2));
	}
}
