import java.util.*;

class BSTConstruction {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            BST currentBST = this;
            while (true) {
                if (currentBST.value <= value) {
                    if (currentBST.right != null) {
                        currentBST = currentBST.right;
                    } else {
                        currentBST.right = new BST(value);
                        break;
                    }
                } else {
                    if (currentBST.left != null) {
                        currentBST = currentBST.left;
                    } else {
                        currentBST.left = new BST(value);
                        break;
                    }
                }
            }
            return this;
        }

        public boolean contains(int value) {
            // Write your code here.
            BST currentBST = this;
            boolean flag = false;
            while (currentBST != null) {
                if (currentBST.value < value) {
                    currentBST = currentBST.right;
                } else if (currentBST.value > value) {
                    currentBST = currentBST.left;
                } else {
                    flag = true;
                    break;
                }
            }
            return flag;
        }

        public BST remove(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            BST currentBST = this;
            BST parentBST = null;
            while (true) {
                if (value > currentBST.value) {
                    parentBST = currentBST;
                    currentBST = currentBST.right;
                } else if (value < currentBST.value) {
                    parentBST = currentBST;
                    currentBST = currentBST.left;
                } else {
                    //判断1：是否双子节点
                    if (currentBST.left != null && currentBST.right != null) {
                        BST smallestBST = currentBST.right;
                        BST smallestParentBST = currentBST;
                        while (smallestBST.left != null) {
                            smallestParentBST = smallestBST;
                            smallestBST = smallestBST.left;
                        }
                        currentBST.value = smallestBST.value;
                        //这里需要判断一下右边的node是不是没有left子节点，怎么判断呢？
                        //就是没有子节点的话smallestParentBST = currentBST
                        //为什么判断呢？考虑情况就是下边这个树，删除10的时候，我们要把15同样删除，但是15没有left子节点，所以不会走while循环，
                        //所以smallestParentBST会停留在currentBST，也就是10
                        //这个时候我们删除10的left显然不对，应该删除的是10的right
                        //  10
                        //  / \
                        // 5   15
                        if (smallestParentBST != currentBST) {
                            smallestParentBST.left = smallestBST.right;
                        } else {
                            currentBST.right = null;
                        }
                    } else if (parentBST == null) { //判断2：是否root
                        if (currentBST.left != null) {
                            //这里有个tricky，如果currentBST.left != null的时候，我们要先改变currentBST.right，
                            //如果我们先改变currentBST.left，后改变right，也就是currentBST.right = currentBST.left.right的时候，
                            //由于上一句已经改变了currentBST.left，那么我们得到的currentBST.left.right就不对了。
                            currentBST.value = currentBST.left.value;
                            currentBST.right = currentBST.left.right;
                            currentBST.left = currentBST.left.left;
                        } else if (currentBST.right != null) {
                            //跟上边注释同样的道理
                            currentBST.value = currentBST.right.value;
                            currentBST.left = currentBST.right.left;
                            currentBST.right = currentBST.right.right;
                        } else {

                        }
                    } else if (currentBST.left != null) {
                        //判断3：是否单子节点
                        if (parentBST.left == currentBST) {
                            parentBST.left = currentBST.left;
                        } else {
                            parentBST.right = currentBST.left;
                        }
                    } else if (currentBST.right != null) {
                        //判断3：是否单子节点
                        if (parentBST.left == currentBST) {
                            parentBST.left = currentBST.right;
                        } else {
                            parentBST.right = currentBST.right;
                        }
                    } else if (currentBST.left == null && currentBST.right == null) {
                        //判断4：是否叶子节点，即没有子节点
                        if (parentBST.left == currentBST) {
                            parentBST.left = null;
                        } else {
                            parentBST.right = null;
                        }
                    }
                    break;
                }
            }
            return this;
        }
    }
}
