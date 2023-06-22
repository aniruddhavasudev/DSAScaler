//package AdvanceDSA;
//
//import java.util.Stack;
//
//class Node {
//	int data;
//	Node left, right;
//
//	public Node(int data) {
//		this.data = data;
//		left = right = null;
//	}
//}
//
//public class SumofLeftLeavesTree {
//	Node root;
//
//	public SumofLeftLeavesTree() {
//		root = null;
//	}
//
//	// Recursive function to find the acestors of a tree
//
//
//	private static int countNodesHelper(Node node, int count) {
//		if (node == null) {
//			return 0;
//		}
//
//		Stack<Node> stack1 = new Stack<>();
//	    Stack<Node> stack2 = new Stack<>();
//	    Node nude = node;
//	    
//	    while (!stack1.isEmpty() || node != null) {
//	        if (node != null) {
//	            stack1.push(node);
//	            node = node.left;
//	            if(node != null) {
//	            	count = count + node.data;
//	            }
//	           
//	        } else {
//	            node = stack1.pop();
//	            node = node.right;
//	        }
//	    }
//	    
//	    
//		return count;
//	}
//
//
//	public static void main(String[] args) {
//
//		SumofLeftLeavesTree tree = new SumofLeftLeavesTree();
//
//		// Create the binary tree
//		tree.root = new Node(3);
//		tree.root.left = new Node(9);
//		tree.root.right = new Node(20);
//		tree.root.right.left = new Node(15);
//		tree.root.right.right = new Node(7);
//
//		Node node = tree.root;
//
//
//
//		System.out.println(countNodesHelper(node, 0));
//	}
//}
