package Solns;

public class testingnewops {
	public static void main(String[] args) {
		int a = -2;
		int b = 7;
		
		
		int carry = a & b;
		
		String result;
	  	
		result = Integer.toBinaryString(a);
	  	System.out.println(result);   
		
		result = Integer.toBinaryString(b);
		System.out.println(result);   
	
		result = Integer.toBinaryString(carry);
		System.out.println(result);   
			
	 
		System.out.println(carry);
		
		a = a ^ b;
		b = carry << 1;
	}
}
