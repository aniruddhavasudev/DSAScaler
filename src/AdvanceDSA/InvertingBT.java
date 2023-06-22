//package AdvanceDSA;
//
//class TreeNode {
//	int val;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int x) { val = x; }
//}
//
//public class InvertingBT {
//	static TreeNode root;
//
//	public static TreeNode Invert(TreeNode node) {
//
//		if(node == null) {
//			return node;
//		}
//
//		if(node.left != null && node.right != null) {
//			TreeNode temp = node.left;
//			node.left = node.right;
//			node.right = temp;
//		}
//		
//		if(node.left == null ) {
//			TreeNode temp = node.right;
//			node.left = node.right;
//			node.right = temp;
//		}
//		
//		if(node.right == null ) {
//			TreeNode temp = node.left;
//			node.right = node.left;
//			node.left = temp;
//		}
//
//		System.out.println(node.val);
//
//		if(node.left.left != null || node.left.right !=null) {
//			node.left = Invert(node.left);
//		}
//
//		if(node.right.left != null || node.right.right !=null) {
//			node.right = Invert(node.right);
//		}
//
//
//
//		return node;
//	}
//
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		InvertingBT tree = new InvertingBT();
//
//		tree.root = new TreeNode(1);
//		tree.root.left = new TreeNode(2);
//		tree.root.right = new TreeNode(3);
//		tree.root.left.left = new TreeNode(4);
//		tree.root.left.right = new TreeNode(5);
//		tree.root.right.right = new TreeNode(6);
//
//
//
//		//		System.out.println(tree.findAncestors(root, 5));
//		//		System.out.println(tree.findAncestors(root, 6));
//
//		System.out.println(Invert(root));
//
//	}
//
//}
