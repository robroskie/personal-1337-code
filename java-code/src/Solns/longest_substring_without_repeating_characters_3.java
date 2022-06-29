package Solns;

import java.util.HashMap;
import java.util.Map;

public class longest_substring_without_repeating_characters_3 {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int startWindow = 0;
        int max = 0;

        for(int endWindow = 0; endWindow < s.length(); endWindow++) {
        
        	char key = s.charAt(endWindow);
 
        	if(map.containsKey(key)) {
        		map.remove(s.charAt(startWindow));
        		startWindow++;
        
        	}

        	map.merge(key, 1, Integer::sum);
        	System.out.println(map);
        	System.out.println("updating max to: " + max + ", " + (endWindow - startWindow + 1));
        	max = Math.max(max, endWindow - startWindow + 1);
        	
        }
        
        
    	return max;
    }
	
	public static void main(String[] args) {
		String s1 = "abcabcbb";
		String s2 = "bbbbb";
		String s3 = "pwwkew";
		
//		System.out.println(lengthOfLongestSubstring(s1));
//		System.out.println(lengthOfLongestSubstring(s2));
		System.out.println(lengthOfLongestSubstring(s3));
	}
}
