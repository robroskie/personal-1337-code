package Solns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class find_all_anagrams_in_a_string_438 {
    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        int startWindow = 0;
        List<Integer> anagrams = new ArrayList<Integer>();
        
        for(int endWindow = 0; endWindow < s.length(); endWindow++) {
			System.out.println(map);
        	map.merge(s.charAt(endWindow), 1, Integer::sum);
        	
        	while(map.size() > p.length()) {
        		char key = s.charAt(startWindow);
        		map.put(key, map.get(key) - 1);
        		if(map.get(key) == 0)
        			map.remove(key);
        		startWindow++;
        	}
        	boolean contains = true;
        	for (int z = 0; z < p.length(); z++) {
        		if(!map.containsKey(p.charAt(z))) {

        			System.out.println("does not contain: " + p.charAt(z));
        			contains = false;
        		}
        	}
        	if(contains) {
        		System.out.println("adding: " + startWindow);
        		anagrams.add(startWindow);
        	}
        	
        }
        return anagrams;
    }
	public static void main(String[] args) {
		String s = "abab";
		String p = "ab";
		
		List<Integer> pp = findAnagrams(s, p);
		System.out.println(pp);
	}
}
