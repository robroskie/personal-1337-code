package Solns;

import java.util.HashMap;
import java.util.Map;

public class permutation_in_string_567 {
	
    public static boolean checkInclusion(String s1, String s2) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		boolean containsAll = false;
		int startWindow = 0;
		
		for(int endWindow = 0; endWindow < s1.length(); endWindow++) {
//			Move the endWindow and add respective value to hashmap
			char key = s1.charAt(endWindow);
			map.merge(key, 1, Integer::sum);
//			Slide startwindow right 
			while(map.size() > s2.length()) {
				Character remove = s1.charAt(startWindow);
				map.put(remove,  (map.get(remove) - 1));
				if(map.get(remove) == 0)
					map.remove(remove);
				startWindow++;
			}

			
			
//			Check if hashmap contains all values in sub
			containsAll = true;
			for(int i = 0; i < s2.length(); i++) {
				if(!map.containsKey(s2.charAt(i))) {
					containsAll = false;
				}
				
			}
			if(containsAll) {
				return true;
			}
			
		}

		return false;
	}


	
	
	
	public static void main(String[] args) {
//		String sub1 = "ab";
//		String s1 = "eidbaooo";
		String sub2 = "ab";
		String s2 = "eidbaooo";
		
//		System.out.println(permutationExists(sub1, s1));
		System.out.println(checkInclusion(s2, sub2));
		
	}
}
