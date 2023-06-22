//package AdvanceDSA;
//
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Deque;
//import java.util.Stack;
//
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
//public class Solution
//{
//	Node root;
//	void inorder()
//	{
//		if (root == null)
//			return;
//
//
//		Stack<Node> s = new Stack<Node>();
//		ArrayList<Integer> arr = new ArrayList<>();
//		Node current  = root;
//		while(current != null || s.size() > 0) {
//			while(current != null) {
//
//				s.push(current);
//				current = current.left;
//			}
//
//			current =s.pop();
//			arr.add(current.data);
//
//			current = current.right;
//
//		}
//		System.out.println(arr);
//
//
//	}
//
//
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Deque<Integer> stack
//		= new ArrayDeque<Integer>();
//
//
//		Solution tree = new Solution();
//
//		tree.root = new Node(1);
//		tree.root.left = new Node(6);
//		tree.root.right = new Node(2);
//		tree.root.right.left = new Node(3);
//
//		tree.inorder();
//
//
//
//	}
//
//}
//
//
