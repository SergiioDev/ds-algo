package leetocde.easy;

import javax.swing.tree.TreeNode;

class SearchBinaryTree {

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode current = root;
        while (current != null) {
            if (current.val == val) {
                break;
            } else if (current.val > val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return current;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
