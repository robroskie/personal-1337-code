package Solns;

import java.util.ArrayList;
import java.util.Collections;

public class sum_of_two_integers_371 {
	public static void main(String[] args) {
		int a = -5;
        int b = 20;
        System.out.println(getSum(a,b));
	}
    
	public static ArrayList<Integer> getBinary(int val) {
//		If dealing with a negative number, use boolean to track that it is negative and treat as positive number
		boolean negative = false;
		if(val < 0) {
			negative = true;
			val *= -1;
		}
		
        ArrayList<Integer> res = new ArrayList<Integer>();
		do {
			if(val % 2 != 0) 
				res.add(Integer.valueOf(1));
			else 
				res.add(Integer.valueOf(0));
			val = (int) Math.floor(val / 2);
        } while(val / 2 != 0 || val > 0);
//		Collections.reverse(res);
		if(negative)
			res.add(1);
		else
			res.add(0);
		System.out.println(res);
		return res;
    }
	
    public static int getSum(int a, int b) {
    	ArrayList<Integer> binaryA = getBinary(a);
    	ArrayList<Integer> binaryB = getBinary(b);
    	ArrayList<Integer> result = new ArrayList<Integer>();
		System.out.println("\n");
    	boolean carry = false;
    	
		boolean baActive = true;
		boolean bbActive = true;
    	
//		perform one's complement to either value if negative 
		if(binaryA.get(binaryA.size() - 1) == 1) {
			ArrayList<Integer> temp = new ArrayList<>(binaryA);
			binaryA.clear();
			for(int i = 0; binaryA.size() < temp.size() - 1; i++) {
				if(temp.get(i) == 1)
					binaryA.add(Integer.valueOf(0));
				else
					binaryA.add(Integer.valueOf(1));
			}
		}
		if(binaryB.get(binaryB.size() - 1) == 1) {
			ArrayList<Integer> temp = new ArrayList<>(binaryB);
			binaryB.clear();
			for(int i = 0; binaryB.size() < temp.size() - 1; i++) {
				if(temp.get(i) == 1)
					binaryB.add(Integer.valueOf(0));
				else
					binaryB.add(Integer.valueOf(1));
			}	
		}
		
		
//		increase size of B with 0's
		if(binaryA.size() > binaryB.size()) {
			int temp = binaryB.get(binaryB.size() - 1);
			binaryB.remove(binaryB.size() - 1);
			while(binaryA.size() - 1 > binaryB.size()) {
				binaryB.add(Integer.valueOf(0));
			}
			binaryB.add(Integer.valueOf(temp));
		}
//		increase size of A with 0's
		else if(binaryA.size() < binaryB.size()) {
			int temp = binaryA.get(binaryA.size() - 1);
			binaryA.remove(binaryA.size() - 1);
			while(binaryA.size() < binaryB.size() - 1) {
				binaryA.add(Integer.valueOf(0));
			}
			binaryA.add(Integer.valueOf(temp));
		}
		System.out.println(binaryA.toString());
		System.out.println(binaryB.toString());
		for(int i = 0; i < binaryA.size(); i++) {
			int tempA = binaryA.get(i);
			int tempB = binaryB.get(i);
			if(tempA == 1 && tempB == 1) {
				result.add(0);
				carry = true;
			}
			else if(tempA == 0 && tempB == 0 && !carry) {
				result.add(0);
				carry = false;
			}
			else if (tempA == 1 || tempB == 1) {
				result.add(1);
				carry = false;
			}
			else if(tempA == 0 && tempB == 0 && carry) {
				result.add(1);
				carry = false;
			}
    		
    	}
		
    	
    	
    	System.out.println("result is: " + result);
    	
    	int toReturn = 0;
    	int i = 0;
    	while(i < result.size() - 1) {
    		if(result.get(i) == 1) {
    			toReturn += Math.pow(2,i);
    		}
    		i++;
    	}
    	if(result.get(i) == 1)
    		toReturn *= -1;
    	
    	
    	return toReturn;
    }
}
