package Mediums;

import java.util.ArrayList;

import java.util.List;

public class clone_graph_133 {
	 
	public static void main(String[] args) {
		
//		intialize first element
		Node n = new Node(1);
		
		n.neighbors.addAll(2);
		
	}
	
//	public Node cloneGraph(Node node) {
     
// }
}



//Definition for a Node.
class Node {
 public int val;
 public List<Node> neighbors;
 public Node() {
     val = 0;
     neighbors = new ArrayList<Node>();
 }
 public Node(int _val) {
     val = _val;
     neighbors = new ArrayList<Node>();
 }
 public Node(int _val, ArrayList<Node> _neighbors) {
     val = _val;
     neighbors = _neighbors;
 }
}


