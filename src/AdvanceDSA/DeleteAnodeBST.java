//package AdvanceDSA;
//
//class TreeNode {
//	int val;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int x) { val = x; }
//}
//
//public class DeleteAnodeBST {
//	static TreeNode root;
//	public TreeNode del(TreeNode root,int k) {
//		if(root == null) {
//			return null;
//		}
//		
//		if(root.val < k) {
//			root.right = del(root.right,k);
//		}
//		
//		else if(root.val > k) {
//			root.left = del(root.left,k);
//		}
//		
//		else {
//			if(root.left == null && root.right == null) {
//				return null;
//			}
//			
//			else if(root.left == null ){
//				return root.right;
//			}
//			
//			else if(root.right == null ){
//				return root.left;
//			}
//			
//			else {
//				int s = findSmallest(root.right);
//				root.val = s;
//				root.right = del(root.right,s);
//					
//				
//			}
//		}
//		
//		System.out.println(root.val);
//		return root;
//		
//	}
//
//	private int findSmallest(TreeNode n) {
//		int min = 0;
//		while(n.left!=null) {
//			min = n.left.val;
//			n = n.left;
//		}
//		return min;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		DeleteAnodeBST tree = new DeleteAnodeBST();
//
//		tree.root = new TreeNode(1);
//		tree.root.left = new TreeNode(2);
//		tree.root.right = new TreeNode(3);
//		tree.root.left.left = new TreeNode(4);
//		tree.root.left.right = new TreeNode(5);
//		tree.root.right.right = new TreeNode(6);
//
//		tree.del(root,5);
//		
//		
//
//
//	}
//
//}
//
