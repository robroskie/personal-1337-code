//Bottom-up approach to dynamic programming 
//Start at the nth stair and work backwards
//Sum the nth and n-1th elements until we reach stair 0

public class dynamic_prog_climbing_stairs_70 {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(numberOfSteps(n));
	}
	public static int numberOfSteps(int n) {
		int temp = 0;
		int n_one = 1;
		int n_two = 1;
		for(int i = 1; i < n; i++) {
			temp = n_one;
			n_one += n_two;
			n_two = temp; 
		}
		return n_one;

	}
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
//Memory Usage: 35.8 MB, less than 37.53% of Java online submissions for Climbing Stairs.