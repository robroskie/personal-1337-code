package Others;

import java.util.Arrays;
import java.util.Comparator;

public class reorder_data_in_log_files_937 {
    public static String[] reorderLogFiles(String[] logs) {
    	
    	StringBuilder rtn = new StringBuilder();
    	
    	String[] digit_logs = new String[logs.length];
    	
    	for(String s : logs) {
    		String[] temp = s.split(" ");
    		
//    		letter log
    		if(temp[1].charAt(0) < '0' && temp[1].charAt(0) > '9') {
    			
    		}
    		else {
    			
    		}
    			
    		
    		
    	}
    	
    	return new String[] {"1", "2"};
    }
	
	public static void main(String[] args) {
		String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		
		System.out.println(reorderLogFiles(logs).toString());
		

	}
}
