package AdvanceDSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Recursive Java program for level
//order traversal of Binary Tree

/* Class containing left and right child of current
node and key value*/
class Node
{
	int data;
	Node left, right;

	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

public class LevelorderTraversal
{
	Node root;
	@SuppressWarnings("null")
	void LevelOrder()
	{
		if (root == null)
			return;



		

		Queue<Node> s = new LinkedList<Node>();  

		s.add(root);

		
		ArrayList<Integer>arr = new ArrayList<>();
		
		
	
		while(!s.isEmpty()) {
			
			int z = s.size();
			ArrayList<Integer>aj = new ArrayList<Integer>();
			for(int j =0; j<z ; j++) {
				
				Node tNode = s.poll();  
				  
				// print the value of the removed node  
				if(tNode == null) {
					arr.add(-1);
				}
				else {
				arr.add(tNode.data);
				  
				// if the left child is present, enqueue the left child   
				  
				s.add(tNode.left);  
				  
				  
				// if the right child is present, enqueue the right child too  
				 
				s.add(tNode.right);  }
				
				
				
			}
			
	
			
			
			}
		System.out.println(arr);
		}







	public static void main(String[] args) {
		// TODO Auto-generated method stub




		LevelorderTraversal tree = new LevelorderTraversal();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(6);

		tree.LevelOrder();



	}

}


