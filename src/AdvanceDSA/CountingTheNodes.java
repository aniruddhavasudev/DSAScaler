//package AdvanceDSA;
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
//public class CountingTheNodes {
//	Node root;
//
//	public CountingTheNodes() {
//		root = null;
//	}
//
//	// Recursive function to find the acestors of a tree
//	  
//
//private static int countNodesHelper(Node node, int maxAncestor) {
//    if (node == null) {
//        return 0;
//    }
//    
//    int count = 0;
//    
//    if (node.data > maxAncestor) {
//        count++;
//        maxAncestor = node.data;
//        System.out.println(maxAncestor);
//    }
//    
//    count += countNodesHelper(node.left, maxAncestor);
//    count += countNodesHelper(node.right, maxAncestor);
//    
//    return count;
//}
//
//
//	public static void main(String[] args) {
//
//		CountingTheNodes tree = new CountingTheNodes();
//
//		// Create the binary tree
//		tree.root = new Node(4);
//		tree.root.left = new Node(5);
//		tree.root.right = new Node(2);
//		tree.root.right.left = new Node(3);
//		tree.root.right.right = new Node(6);
//		int max = 0;
//		int count = 0;
//		
//		Node node = tree.root;
//	
//
//	
//		System.out.println(countNodesHelper(node, Integer.MIN_VALUE));
//		
////		System.out.println("******************************");
////		
////		System.out.println(countNodesHelper(nude, Integer.MIN_VALUE));
//	}
//}
