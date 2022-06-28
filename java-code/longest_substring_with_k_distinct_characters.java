package Medium;

import java.util.HashMap;
import java.util.Map;

public class longest_substring_with_k_distinct_characters {

	public static int longestSubstr(String s, int K) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		int windowStart = 0;
		
		for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
//			System.out.println(map.toString());
//			System.out.println("loop");
//			add the next element to the window
			map.merge((char) s.charAt(windowEnd), 1, Integer::sum);
			
			//	more than 2 values in hashmap, remove first value
			while(map.size() > K) {
//				System.out.println("inner loop");
//				System.out.println(map.toString());
//				System.out.println("inner loop\n");
		
				Character first = s.charAt(windowStart);
//				System.out.println("removing" + first);
				map.put(first, map.get(first) - 1);
				if(map.get(first) == 0) {
					map.remove(first);
				}
				windowStart++;
			}
		    max = Math.max(windowEnd - windowStart + 1, max);
	
		}
	
		return max;

	}
	
	public static void main(String[] args) {
		String s = "araaci";
		int K = 2;
		
		int ans = longestSubstr(s, K);
		System.out.println(ans);
		
		System.out.println(longestSubstr("araaci", 1));
		System.out.println(longestSubstr("cbbebi", 3));
	}

}



//Input: String="araaci", K=2
//Output: 4
//Explanation: The longest substring with no more than '2' distinct characters is "araa".
//Example 2:
//
//Input: String="araaci", K=1
//Output: 2
//Explanation: The longest substring with no more than '1' distinct characters is "aa".
//Example 3:
//
//Input: String="cbbebi", K=3
//Output: 5
//Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".