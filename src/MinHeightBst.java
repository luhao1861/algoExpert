import java.util.*;

class MinHeightBst {
    public static BST minHeightBst(List<Integer> array) {
        // Write your code here.

        return constructMinBST(null, 0, array.size() - 1, array);
    }

    public static BST constructMinBST(BST node, int startIndex, int endIndex, List<Integer> array) {
        if (startIndex > endIndex) return null;
        int midIdx = (startIndex + endIndex) / 2;
        node = node == null ? new BST(array.get(midIdx)) : node;
        if (node.value < array.get(midIdx)) {
            node.right = new BST(array.get(midIdx));
            node = node.right;
        } else {
            node.left = new BST(array.get(midIdx));
            node = node.left;
        }
        constructMinBST(node, startIndex, midIdx - 1, array);
        constructMinBST(node, midIdx + 1, endIndex, array);
        return node;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
