package Solns;

public class sum_of_two_integers_371V2 {
	public static void main(String[] args) {
		System.out.println(3 ^ 2);
		System.out.println(3 & 2);
		System.out.println((3 & 2) << 1);
		int a = 12;
		System.out.println("a is: " + Integer.toBinaryString(a));
		int b = 25;

		

		int result;

		do {
			result = a & b;
			a = a ^ b;
			b = result << 1;
		}
		while(b != 0);
	}
}
