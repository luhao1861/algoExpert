import java.util.*;

class SumNodeDepths {

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        return sumNodeDepths(root, 0);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static int sumNodeDepths(BinaryTree node, int currentDepth) {
        int left = 0;
        int right = 0;
        if (node.left != null) {
            left = sumNodeDepths(node.left, currentDepth + 1);
        }
        if (node.right != null) {
            right = sumNodeDepths(node.right, currentDepth + 1);
        }
        return currentDepth + left + right;
    }
}
