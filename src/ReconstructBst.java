import com.sun.source.tree.Tree;

import java.util.*;

class ReconstructBst {
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
        public int index;

        public TreeInfo(int index) {
            this.index = index;
        }
    }

    public BST reconstructBst(List<Integer> preOrderTraversalValues) {
        // Write your code here.
        TreeInfo treeInfo = new TreeInfo(0);
        return reconstructBst(-Integer.MAX_VALUE,Integer.MAX_VALUE,preOrderTraversalValues,treeInfo);
    }

    public BST reconstructBst(int lowerBound, int upperBound, List<Integer> preOrderTraversalValues, TreeInfo treeInfo) {
        if (treeInfo.index == preOrderTraversalValues.size()) return null;
        if (preOrderTraversalValues.get(treeInfo.index) < lowerBound || preOrderTraversalValues.get(treeInfo.index) >= upperBound)
            return null;
        BST currentNode = new BST(preOrderTraversalValues.get(treeInfo.index));
        treeInfo.index += 1;
        currentNode.left = reconstructBst(lowerBound, currentNode.value, preOrderTraversalValues, treeInfo);
        currentNode.right = reconstructBst(currentNode.value, upperBound, preOrderTraversalValues, treeInfo);
        return currentNode;
    }
}
