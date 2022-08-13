package Others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class partition_labels_763 {
    public static List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
    	for(int i = 0; i < s.length(); i++) {
    		map.put(s.charAt(i), i);
    	}
    	
    	List<Integer> result = new ArrayList<>();  	
    	int max = 0;
    	int previous = -1;
  
    	for(int i  = 0; i < s.length(); i++) {
    		max = Math.max(map.get(s.charAt(i)), max);
    		
    		if(i == max) {
    			result.add(max - previous);
    			previous = max;
    		}
    	}
    	return result;
    }
    
	public static void main(String[] args) {
		String s = "ababcbacadefegdehijhklij";
		System.out.println(partitionLabels(s));
	}
}
