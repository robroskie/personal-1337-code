package Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordLadder {

	public static void main(String[] args) {
		String[] wordList = {"hot","dot","dog","lot","log","cog"};
		
		Map<String, ArrayList<String>> map = new HashMap<>();
	
		
		for(int i = 0; i < wordList.length; i++) {
			for(int x = 0; x < wordList[i].length(); x++) {
				String current_word = wordList[i].substring(0,x) + "*" + wordList[i].substring(x+1);
				ArrayList<String> temp = new ArrayList<>();
				temp.add(current_word);
				
				if(map.containsKey(current_word))
					map.put(current_word, temp.addAll(map.get(current_word)));
				else
					map.put(current_word, );
			}
		}
		
		for(String s : map.keySet()) {
			String[] temp = map.get(s);
			for(String t : temp) {
				map.get(t);
			}
		}
	}
}
