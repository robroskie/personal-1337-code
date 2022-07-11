
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
		
		System.out.println("---------");
		printList(list2);
		System.out.println("---------");
		
		ListNode list_empty = new ListNode(1);
		
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
    	//If the head parameter is empty or only contains one element, return it 
    	if(head == null || head.next == null)
    		return head;

    	//Otherwise create a new Node for each Node in current ListNode
    	//Make new ListNode point to previous element containing ListNode
    	//and repeat until entire head ListNode is iterated over
    	ListNode prev = new ListNode(head.val);
    	ListNode curr = new ListNode();
    	head = head.next;
    	
    	while(head != null) {
    		curr = new ListNode(head.val);
    		curr.next = prev;
    		prev = curr;
    		head = head.next;
    	}
    	
    	return curr;
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

//After refactor 

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
//Memory Usage: 38.4 MB, less than 88.41% of Java online submissions for Reverse Linked List.