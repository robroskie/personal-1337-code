package Solns;

import java.util.ArrayList;
import java.util.Collections;

public class sum_of_two_integers_371 {
	public static void main(String[] args) {
		int a = -1;
        int b = 1;
        System.out.println(getSum(a,b));
	}
    
	public static ArrayList<Integer> getBinary(int val) {
        ArrayList<Integer> res = new ArrayList<Integer>();
		do {
			if(val % 2 != 0) 
				res.add(Integer.valueOf(1));
			else 
				res.add(Integer.valueOf(0));
			val = (int) Math.floor(val / 2);
        } while(val / 2 != 0 || val > 0);
//		Collections.reverse(res);
		System.out.println(res);
		return res;
    }
	
    public static int getSum(int a, int b) {
    	ArrayList<Integer> binaryA = getBinary(a);
    	ArrayList<Integer> binaryB = getBinary(b);
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	
    	boolean addNext = false;
    	
    	for(int i = 0; i < Math.max(binaryA.size(), binaryB.size()); i++) {
    		int temp = addNext ? 1 : 0;
    		System.out.println("before temp is: " + temp);
    		if(i < binaryA.size()) {
    			System.out.println("adding A" + binaryA.get(i));
    			temp += binaryA.get(i);
    		}
    		if(i < binaryB.size()) {
    			System.out.println("adding B" + binaryB.get(i));
    			temp += binaryB.get(i);
    		}
    		System.out.println("temp is: " + temp + "\n");
    		if(temp > 1) {
    			addNext = true;
    			result.add(Integer.valueOf(temp % 2));
    		}
    		else if(temp == 1) {
    			addNext = false;
    			result.add(1);
    		}
    		else {
    			addNext = false;
    			result.add(0);
    		}
    		
    		
    	}
    	if(addNext) 
    		result.add(1);
    	
    	
    	System.out.println(result);
    	
    	int toReturn = 0;
    	
    	for(int i = 0; i < result.size(); i++) {
    		if(result.get(i) == 1) {
    			toReturn += Math.pow(2,i);
    		}
    	}
    	
    	return toReturn;
    }
}
