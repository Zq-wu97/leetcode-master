//请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。 
//
// 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。 
//
// 1 
// / \ 
// 2 2 
// / \ / \ 
//3 4 4 3 
//但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的: 
//
// 1 
// / \ 
// 2 2 
// \ \ 
// 3 3 
//
// 
//
// 示例 1： 
//
// 输入：root = [1,2,2,3,4,4,3]
//输出：true
// 
//
// 示例 2： 
//
// 输入：root = [1,2,2,null,3,null,3]
//输出：false 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 1000 
//
// 注意：本题与主站 101 题相同：https://leetcode-cn.com/problems/symmetric-tree/ 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 293 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        // 先镜像后一个个比较
//        TreeNode mirror = mirrorTree(root);
//        return equalTree(root, mirror);
        if (root == null) return true;
        return isEquals(root.left, root.right);
    }

    public boolean isEquals(TreeNode A, TreeNode B) {
        if (A == null && B == null) return true;
        if (A == null || B == null || A.val != B.val) return false;
        return isEquals(A.left, B.right) && isEquals(A.right, B.left);
    }



//    public boolean equalTree(TreeNode tree1, TreeNode tree2) {
//        if ((tree1 == null && tree2 == null)) return true;
//        if (tree1 == null || tree2 == null) return false;
//        return tree1.val == tree2.val && equalTree(tree1.left, tree2.left) && equalTree(tree1.right, tree2.right);
//    }
//
//    public TreeNode mirrorTree(TreeNode root) {
//        if (root == null) return null;
//        TreeNode newRoot = new TreeNode(root.val);
//        TreeNode temp = root.left;
//        newRoot.left = mirrorTree(root.right);
//        newRoot.right = mirrorTree(temp);
//        return newRoot;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
