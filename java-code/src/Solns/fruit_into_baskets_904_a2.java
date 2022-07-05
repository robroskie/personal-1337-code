package Solns;

import java.util.HashMap;

public class fruit_into_baskets_904_a2 {
    public static int totalFruit(int[] fruits) {
    	int startWindow = 0;
    	
    	int maxFruit = 0;
    	
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int endWindow = 0; endWindow < fruits.length; endWindow++) {
    		System.out.println(startWindow + ", " + endWindow + ", ");
    		System.out.println(map);
    		map.merge(fruits[endWindow], 1, Integer::sum);
    		
    		while(map.size() > 2) {
    			map.put(fruits[startWindow], map.get(fruits[startWindow]) - 1);
    		
    			if(map.get(fruits[startWindow]) == 0) {
    				map.remove(fruits[startWindow]);
    			}
    			startWindow++;
    		}
 
    		maxFruit = Math.max(maxFruit, endWindow - startWindow + 1);
    	}
    	return maxFruit;
    }
	
    public static void main(String[] args) {
    	System.out.println(totalFruit(new int[] {1,2,3,2,2}));
    }
	
}
