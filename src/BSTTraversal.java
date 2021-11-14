import java.util.*;

class BSTTraversal {
    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        if (tree.left != null) {
            inOrderTraverse(tree.left, array);
        }
        array.add(tree.value);
        if (tree.right != null) {
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        array.add(tree.value);
        if (tree.left != null) {
            inOrderTraverse(tree.left, array);
        }

        if (tree.right != null) {
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.

        if (tree.left != null) {
            inOrderTraverse(tree.left, array);
        }

        if (tree.right != null) {
            inOrderTraverse(tree.right, array);
        }
        array.add(tree.value);
        return array;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
