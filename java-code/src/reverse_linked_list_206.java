//Push values from listnode parameter onto stack
//Pop values off of stack and add to original listnode in order 
//Need refactoring to increase speed

import java.util.Stack;

public class reverse_linked_list_206 {
	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		ListNode temp = list;
		
	
		temp.next = new ListNode(2);
		
		temp = temp.next;
		temp.next = new ListNode(3);
		
		temp = temp.next;
		temp.next = new ListNode(4);
		
		temp = temp.next;
		temp.next = new ListNode(5);
		
		temp = temp.next;

		printList(list);
		
		ListNode list2 = reverseList(list);
		
		printList(list2);
		
		System.out.println("---------");
		
		ListNode list_empty = new ListNode();
		
		ListNode list_empty_rev = reverseList(list_empty);
		printList(list_empty_rev);
		
	}
	
	public static void printList(ListNode list) {
		ListNode temp = list;
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
		
	}
	
    public static ListNode reverseList(ListNode head) {
    	if(head == null)
    		return head;
    	
    	Stack<Integer> values = new Stack<>();
    	ListNode itr = head;
    	while (itr != null) {
    		values.push(itr.val);
    		itr = itr.next;
    	}
    	System.out.println("values are: " + values.toString());
    		

    	head = new ListNode(values.pop());
  
    	ListNode temp = head;
    	
    	while(!values.isEmpty()) {
    		System.out.println("pushing : " + values.peek());
      		temp.next = new ListNode(values.pop());
    		temp = temp.next;
    	}
    	
    	return head;
    }
	
	static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		
	}
	
}

//Runtime: 17 ms, faster than 6.23% of Java online submissions for Reverse Linked List.
//Memory Usage: 38.5 MB, less than 79.53% of Java online submissions for Reverse Linked List.

