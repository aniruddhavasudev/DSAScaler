//package AdvanceDSA;
//
//class TreeNode {
//	int val;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int x) { val = x; }
//}
//
//public class Diameterofbinarytree {
//	static TreeNode root;
//	public void verticalOrder(TreeNode root) {
//
//
//	}
//
//	public int getMax(TreeNode root) {
//		if (root == null) {
//            return 0;
//        }
//        // get the height of left and right subtrees
//        int leftHeight = getdia(root.left);
//        int rightHeight = getdia(root.right);
//        // return the larger height + 1
//        return Math.max(leftHeight, rightHeight) + 1;
//
//		return 0;
//
//
//	}
//
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		VerticalOrderTraversalBT tree = new VerticalOrderTraversalBT();
//
//		tree.root = new TreeNode(1);
//		tree.root.left = new TreeNode(2);
//		tree.root.right = new TreeNode(3);
//		tree.root.left.left = new TreeNode(4);
//		tree.root.left.right = new TreeNode(5);
//		tree.root.right.right = new TreeNode(6);
//
//		tree.verticalOrder(root);
//	}
//
//}
//
