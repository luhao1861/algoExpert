import java.util.*;

class BranchSums {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        ArrayList<Integer> array = new ArrayList<Integer>();
        branchSums(root, 0, array);
        return array;
    }

    public static void branchSums(BinaryTree root, int currentSum, List<Integer> sumArray) {
        if (root.left == null && root.right == null) {
            sumArray.add(currentSum + root.value);
        } else {
            if(root.left != null) {
                branchSums(root.left, currentSum + root.value, sumArray);
            }
            if(root.right != null) {
                branchSums(root.right, currentSum + root.value, sumArray);
            }
        }
    }
}
