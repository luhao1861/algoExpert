import java.util.ArrayList;

class FindKthLargestValueInBst {

    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    class TreeInfo {
        public int visitedNumber;
        public int returnValue;

        public TreeInfo(int visitedNumber, int returnValue) {
            this.visitedNumber = visitedNumber;
            this.returnValue = returnValue;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        // Write your code here.
        int visitedNumber = 0;
        int returnValue = Integer.MAX_VALUE;
        TreeInfo treeInfo = new TreeInfo(visitedNumber, returnValue);
        reversInOrderValues(tree, treeInfo, k);
        return treeInfo.returnValue;
    }

    public void reversInOrderValues(BST tree, TreeInfo treeInfo, int k) {
        if (treeInfo.visitedNumber >= k || tree == null) return;
        reversInOrderValues(tree.right, treeInfo, k);
        if (treeInfo.visitedNumber < k) {
            treeInfo.visitedNumber += 1;
            treeInfo.returnValue = tree.value;
            reversInOrderValues(tree.left, treeInfo, k);
        }
    }
}
