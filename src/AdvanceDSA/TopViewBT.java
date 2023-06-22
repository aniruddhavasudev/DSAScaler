//package AdvanceDSA;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Node
//{
//	int data;
//	Node left, right;
//
//	public Node(int item)
//	{
//		data = item;
//		left = right = null;
//	}
//}
//
//public class TopViewBT
//{
//	Node root;
//	@SuppressWarnings("null")
//	void LevelOrder()
//	{
//		if (root == null)
//			return;
//
//
//		Queue<Node> s = new LinkedList<Node>();  
//
//		s.add(root);
//		
//
//
//		ArrayList<Integer>arr = new ArrayList<>();
//		arr.add(root.data);
//
//
//		while(!s.isEmpty()) {
//
//			int z = s.size();
//			for(int j =0; j<z ; j++) {
//
//				Node tNode = s.poll(); 
//				System.out.println(tNode.data);
//				
//				// print the value of the removed node  
//
//				if( tNode!= null && tNode.left!= null ) {
//					
//					s.add(tNode.left);
//					arr.add(tNode.left.data);
//					}
//				}
//				// if the left child is present, enqueue the left child   
//				// if the right child is present, enqueue the right child too  
//
//				  }
//		s.add(root);
//
//		while(!s.isEmpty()) {
//
//			int z = s.size();
//			for(int j =0; j<z ; j++) {
//
//				Node tNode = s.poll(); 
//				
//				// print the value of the removed node  
//
//				if( tNode!= null && tNode.right!= null ) {
//					
//					s.add(tNode.right);
//					arr.add(tNode.right.data);
//					}
//				}
//				// if the left child is present, enqueue the left child   
//				// if the right child is present, enqueue the right child too  
//
//				  }
//		
//		System.out.println(arr);
//
//		}
//
//
//		
//
//	
//	
//
//
//
//
//
//
//
//
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//
//
//
//	TopViewBT tree = new TopViewBT();
//
//	tree.root = new Node(1);
//	tree.root.left = new Node(2);
//	tree.root.right = new Node(3);
//	tree.root.left.left = new Node(4);
//	tree.root.left.right = new Node(5);
//	tree.root.right.right = new Node(6);
//
//	tree.LevelOrder();
//
//
//
//}
//
//}
//
//
