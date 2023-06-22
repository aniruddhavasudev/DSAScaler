package AdvanceDSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class BoundaryTraversalOfBinaryTree {
	static TreeNode root;
	public void verticalOrder(TreeNode root) {

		ArrayList<Integer> res = new ArrayList<>();

		if (root == null) {
			//return res;
		}

		Queue<Integer> dist = new LinkedList<>();
		res.add(root.val);

		while(root!= null) {

			if(root.left !=  null) {
				root = root.left;
				res.add(root.val);
				System.out.println(root.val);

			}

			if(root.right!= null && root.right.right == null && root.right.left == null) {
				res.add(root.right.val);
				System.out.println(root.right.val);
			}
		}

		while(root!= null) {

			if(root.right !=  null) {
				dist.add(root.right.val);
				System.out.println(root.right.val);
			}

			if(root.left!= null && root.right.left == null && root.right.right == null) {
				dist.add(root.left.val);
				System.out.println(root.left.val);
			}
		}

		while(dist!= null) {

			int n = dist.poll();
			res.add(n);
		}

		System.out.println(res);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BoundaryTraversalOfBinaryTree tree = new BoundaryTraversalOfBinaryTree();

		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.right = new TreeNode(6);

		tree.verticalOrder(root);


	}

}
