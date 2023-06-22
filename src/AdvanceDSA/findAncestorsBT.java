//package AdvanceDSA;
//
//import java.util.ArrayList;
//
//class TreeNode {
//	int val;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int x) { val = x; }
//}
//
//public class findAncestorsBT {
//	static TreeNode root;
//	public ArrayList<Integer> findAncestors(TreeNode root, int target) {
//		ArrayList<Integer> ancestors = new ArrayList<Integer>();
//		findAncestorsHelper(root, target, ancestors);
//		return ancestors;
//	}
//
//	private boolean findAncestorsHelper(TreeNode node, int target, ArrayList<Integer> ancestors) {
//		if (node == null) {
//			return false;
//		}
//
//		if (node.val == target) {
//			return true;
//		}
//
//		if (findAncestorsHelper(node.left, target, ancestors) || findAncestorsHelper(node.right, target, ancestors)) {
//			ancestors.add(node.val);
//			return true;
//		}
//
//		return false;
//	}
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		findAncestorsBT tree = new findAncestorsBT();
//
//		tree.root = new TreeNode(3);
//		tree.root.left = new TreeNode(1);
////		tree.root.right = new TreeNode(3);
////		tree.root.left.left = new TreeNode(4);
////		tree.root.left.right = new TreeNode(5);
////		tree.root.right.right = new TreeNode(6);
//
//		ArrayList<Integer> result = new ArrayList<>();
//
//
////		System.out.println(tree.findAncestors(root, 5));
////		System.out.println(tree.findAncestors(root, 6));
//
//		result = tree.findAncestors(root, 1);
//		System.out.println(result.get(0));
//	}
//
//}
