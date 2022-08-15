package Amazon;

import java.util.HashMap;
import java.util.Map;

public class arrays_and_hashing_217 {
	public static boolean containsDuplicate(int[] nums){
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    for(int i = 0; i < nums.length; i++){
	        map.merge(nums[i],1,Integer::sum);
	    }
	    System.out.println(map);
	    for(int element : map.keySet()) {
	    	if(map.get(element) > 1)
	    		return true;
	    }
	    return false;
	}

	public static void main(String[] args) {
		containsDuplicate(new int[] {1,2,3,4});
	}
}
