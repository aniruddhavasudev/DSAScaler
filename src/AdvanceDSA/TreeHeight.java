//package AdvanceDSA;
//
//class Node {
//    int data;
//    Node left, right;
//
//    public Node(int data) {
//        this.data = data;
//        left = right = null;
//    }
//}
//
//public class TreeHeight {
//    Node root;
//
//    public TreeHeight() {
//        root = null;
//    }
//
//    // Recursive function to find the height of a tree
//    public int height(Node node) {
//        if (node == null) {
//            return 0;
//        } else {
//            int leftHeight = height(node.left);
//            int rightHeight = height(node.right);
//
//            // Return the maximum of the left and right subtree heights, plus 1
//            return Math.max(leftHeight, rightHeight) + 1;
//        }
//    }
//
//    public static void main(String[] args) {
//        TreeHeight tree = new TreeHeight();
//
//        // Create the binary tree
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//
//        // Find the height of the tree
//        int height = tree.height(tree.root);
//        System.out.println("Height of the tree is: " + height);
//    }
//}
