package Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class group_anagrams_49 {
	public static boolean isAnagram(String s, String t) {
//    	not same length
		if (s.length() != t.length())
			return false;

		HashMap<Character, Integer> mapS = new HashMap<>();
		HashMap<Character, Integer> mapT = new HashMap<>();

//       build hashmap for s
		for (int i = 0; i < s.length(); i++) {
			mapS.merge(s.charAt(i), 1, Integer::sum);
		}
//      build hashmap for t
		for (int i = 0; i < t.length(); i++) {
			mapT.merge(t.charAt(i), 1, Integer::sum);
		}

		System.out.println(mapS);
		System.out.println(mapT);

//      check if hashmaps match (if they don't for any value, return false
		return mapS.equals(mapT);

	}

	public static void main(String[] args) {
		String[] anagrams = new String[] {"eat","tea","tan","ate","nat","bat"};
		
		ArrayList<String> strings = new ArrayList<>();
		
		for(int i = 0; i < anagrams.length; i++) {
			strings.add(i, anagrams[i]);
		}
		
		List<List<String>> res = new ArrayList<>();
		
		while(strings.size() > 0) {
			List<String> temp = new ArrayList<>();
			temp.add(strings.get(0));
			strings.remove(0);
			
			for(int i = 0; i < strings.size(); i++) {
				if(isAnagram(temp.get(0), strings.get(i))) {
					temp.add(strings.get(i));
					strings.remove(i);
				}
			}
			res.add(temp);
		}
		
		System.out.println(res);
	}
}
