//class Program {
//
//    public boolean validateBst(BST tree) {
//        // Write your code here.
//        BST currentNode = tree;
//        return validateBst(Integer.MIN_VALUE, Integer.MAX_VALUE, currentNode);
//    }
//
//    public  boolean validateBst(int min, int max, BST tree) {
//        if (tree == null) return true;
//        if (tree.value < min || tree.value > max) return false;
//        boolean leftValidation = validateBst(min, tree.value, tree.left);
//        boolean rightValidation = validateBst(tree.value, max, tree.right);
//        return leftValidation && rightValidation;
//    }
//
//    static class BST {
//        public int value;
//        public BST left;
//        public BST right;
//
//        public BST(int value) {
//            this.value = value;
//        }
//    }
//}

import java.util.*;
class ValidateBst {
    public static boolean validateBst(BST tree) {
        // Write your code here.
        BST currentNode = tree;
        return validateBst(Integer.MIN_VALUE, Integer.MAX_VALUE, currentNode);
    }
    public static boolean validateBst(int min, int max, BST tree){
        boolean flag = true;
        if(!(tree.value >= min && tree.value < max)){
            flag = false;
        }
        if(tree.left != null && !validateBst(min,tree.value,tree.left)){
            flag = false;
        }
        if(tree.right != null && !validateBst(tree.value,max,tree.right)){
            flag = false;
        }
        return flag;

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
