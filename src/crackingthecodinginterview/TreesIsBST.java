package crackingthecodinginterview;

/**
 * Check whether the tree is a BST
 * Created by dinu on 12/30/16.
 */
public class TreesIsBST {

    /* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions. */

    boolean checkBST(Node root) {
        boolean isBST;
        Node current = root;
        // root.data should be larger than the left subtree max value
        if (current.left != null && getMax(current.left) < current.data) {
            current = current.left;
            isBST = checkBST(current);
            if (!isBST) {
                return false;
            }
        } else if (current.left != null && getMax(current.left) >= current.data) {
            return false;
        }
        current = root;
        // root.data should be smaller than the right subtree min value
        if (current.right != null && getMin(current.right) > current.data) {
            current = current.right;
            isBST = checkBST(current);
            if (!isBST) {
                return false;
            }
        } else if (current.right != null && getMin(current.right) <= current.data) {
            return false;
        }
        return true;
    }

    int getMin(Node root) {
        int min = Integer.MAX_VALUE;
        while (root != null) {
            if (root.data < min) {
                min = root.data;
            }
            root = root.left;
        }
        //System.out.println(min);
        return min;
    }

    int getMax(Node root) {
        int max = Integer.MIN_VALUE;
        while (root != null) {
            if (root.data > max) {
                max = root.data;
            }
            root = root.right;
        }
        //System.out.println(max);
        return max;

    }

    class Node {
        int data;
        Node left;
        Node right;
    }

}