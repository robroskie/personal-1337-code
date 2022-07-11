//Runtime: Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
//Memory Usage: 39.6 MB, less than 29.33% of Java online submissions for Add Two Numbers.

public class add_two_numbers_2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//Initialize resulting listnode and temporary list pointer
		ListNode l_result = new ListNode(0);
		l_result.next = null;
		ListNode temp3 = l_result;
		
		//If the two current values are >= 10, we need to carry 1 to the next digit
		if(l1.val + l2.val >= 10) 
			temp3.next = new ListNode(1);
			
		//Iterate while at least one of the lists has remaining nodes
		while(l1 != null || l2 != null) {
			if(l1 != null) {
				temp3.val += l1.val;
				l1 = l1.next;
			}
			if(l2 != null) {
				temp3.val += l2.val;
				l2 = l2.next;
			}
			
			if(temp3.val >= 10) {
				temp3.next = new ListNode(0);
				temp3.next.val += 1;
				temp3.val %= 10;
			}
			else if(l1 != null || l2 != null)
				temp3.next = new ListNode(0);
			
			temp3 = temp3.next;
		}

		return l_result;
	}
	
	public static void main(String[] args) {
		//Initialize first listnode to test
		ListNode l1 = new ListNode(2);
		ListNode temp1 = l1;
	
		temp1.next = new ListNode(4);
		temp1 = temp1.next;
		temp1.next = new ListNode(3);

		temp1 = temp1.next;
		temp1.next = null;
		temp1 = l1;

		//Initialize second Listnode to test
		ListNode l2 = new ListNode(5);
		ListNode temp2 = l2;
	
		temp2.next = new ListNode(6);
		temp2 = temp2.next;
		temp2.next = new ListNode(4);
		temp2 = temp2.next;

		temp2.next = null;
		temp2 = l2;
		
		printNode(l1);
		printNode(l2);
		
		
		//Call method to add the two list nodes and return resulting value as a list node in same format
		ListNode result = addTwoNumbers(l1,l2);
		System.out.print("The resulting list is: ");
		printNode(result);
	}
	
	public static void printNode(ListNode l) {
		
		while(l != null) {
			System.out.print(l.val);
			l = (l.next == null) ? null : l.next;
		}
		System.out.println("\n");
	}
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {this(0);}
      ListNode(int val) { this.val = val;}
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }    
}
