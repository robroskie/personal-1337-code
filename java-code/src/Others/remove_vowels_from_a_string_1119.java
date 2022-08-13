package Others;

import java.util.HashSet;
import java.util.Set;

public class remove_vowels_from_a_string_1119 {
	public static String removeVowels(String S) {
		Set<Character> map = new HashSet<Character>(); 
		
		map.add('a');
		map.add('e');
		map.add('i');
		map.add('o');
		map.add('u');
		
		StringBuilder str = new StringBuilder();
		
		for(int i = 0; i < S.length(); i++){
			if(!map.contains(S.charAt(i)))
				str.append(S.charAt(i));
		}
		
		return str.toString();
	}
	
	public static void main(String[] args) {
		String s = "leetcodeisacommunityforcoders";
		String ans = removeVowels(s);
		System.out.println(ans);
		
		System.out.println(removeVowels("aeiou"));
	}
}
