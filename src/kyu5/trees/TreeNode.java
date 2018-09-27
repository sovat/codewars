package kyu5.trees;

public class TreeNode {

    TreeNode left;
    TreeNode right;


    public static boolean isPerfect(TreeNode root) {

        if (root != null) {
            if (root.right == null && root.left == null) {
                return true;
            }
            if ((root.right != null && root.left != null)) {
                return isPerfect(root.right) && isPerfect(root.left);
            }
        }

        if (root == null) {
            return true;
        }
        return false;
    }

    static TreeNode leaf() {
        return new TreeNode();
    }

    static TreeNode join(TreeNode left, TreeNode right) {
        return new TreeNode().withChildren(left, right);
    }

    TreeNode withLeft(TreeNode left) {
        this.left = left;
        return this;
    }

    TreeNode withRight(TreeNode right) {
        this.right = right;
        return this;
    }

    TreeNode withChildren(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
        return this;
    }

    TreeNode withLeftLeaf() {
        return withLeft(leaf());
    }

    TreeNode withRightLeaf() {
        return withRight(leaf());
    }

    TreeNode withLeaves() {
        return withChildren(leaf(), leaf());
    }
}
