package Solns;

import java.util.HashMap;
import java.util.Map;

public class longest_substring_without_repeating_characters_3 {
	public static int lengthOfLongestSubstring(String s) {
		int longestSubstr = 0;
		int startWindow = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int endWindow = 0; endWindow < s.length(); endWindow++) {
			System.out.println(map);
			if(map.containsKey(s.charAt(endWindow))) {
				System.out.println("removing key: " + s.charAt(startWindow));
				map.remove(s.charAt(startWindow));
				startWindow++;
			}

			
			map.merge(s.charAt(endWindow), 1, Integer::sum);
	

			longestSubstr = Math.max(longestSubstr, endWindow - startWindow + 1);

		}

		return longestSubstr;

	}

	public static void main(String[] args) {
//		String s1 = "abcabcbb";
//		String s2 = "bbbbb";
		String s3 = "pwwkew";
//		String s4 = "au";

		
//		System.out.println(lengthOfLongestSubstring(s1));
//		System.out.println(lengthOfLongestSubstring(s2));
		System.out.println(lengthOfLongestSubstring(s3));
//		System.out.println(lengthOfLongestSubstring(s4));
	}
}
