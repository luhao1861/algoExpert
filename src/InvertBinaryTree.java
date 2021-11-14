import java.util.*;

class InvertBinaryTree {
    public static void invertBinaryTree(BinaryTree tree) {
        // Write your code here.
        if (tree == null) return;
        BinaryTree leftNode = tree.left;
        BinaryTree rightNode = tree.right;
        tree.left = rightNode;
        tree.right = leftNode;
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }


}
