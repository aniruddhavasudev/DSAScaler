//package AdvanceDSA;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Queue;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}
//
//public class VerticalOrderTraversalBT {
//	static TreeNode root;
//    public void verticalOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        if (root == null) {
////            return res;
//        }
//
//        // Create a map to store the horizontal distance and the corresponding nodes
//        Map<Integer, List<Integer>> map = new HashMap<>();
//
//        // Create a queue to perform BFS
//        Queue<TreeNode> q = new LinkedList<>();
//        Queue<Integer> dist = new LinkedList<>();
//
//        // Add the root node and the horizontal distance of 0
//        q.add(root);
//        dist.add(0);
//
//        // Perform BFS
//        while (!q.isEmpty()) {
//            TreeNode node = q.poll();
//            int d = dist.poll();
//
//            // Add the node value to the list at the corresponding horizontal distance
//            map.putIfAbsent(d, new ArrayList<>());
//            map.get(d).add(node.val);
//
//            // Add the left and right children of the node to the queue
//            if (node.left != null) {
//                q.add(node.left);
//                dist.add(d - 1);
//            }
//            if (node.right != null) {
//                q.add(node.right);
//                dist.add(d + 1);
//            }
//        }
//
//        // Sort the keys of the map and add the corresponding lists to the result
//        List<Integer> keys = new ArrayList<>(map.keySet());
//        Collections.sort(keys);
//        for (int key : keys) {
//            res.add(map.get(key));
//        }
//
//        System.out.println(res); 
//    }
//
//
//
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//
//
//
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
//
//
//
//	}
//
//}
