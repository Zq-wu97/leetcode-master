//请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。 
//
// 
//
// 例如: 
//给定二叉树: [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [20,9],
//  [15,7]
//]
// 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 1000 
// 
// Related Topics 树 广度优先搜索 二叉树 👍 185 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.*;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 两个栈(自己方法)
        int height = 0;
        List<List<Integer>> res = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        if (root != null) {
            stack1.push(root);
            height++;
        }
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            if ((height % 2) != 0 ) {
                for (int i = stack1.size(); i > 0; i--) {
                    TreeNode node = stack1.pop();
                    list.add(node.val);
                    if (node.left != null) stack2.push(node.left);
                    if (node.right != null) stack2.push(node.right);
                }
                height++;
                res.add(list);
            } else {
                for (int i = stack2.size(); i > 0; i--) {
                    TreeNode node = stack2.pop();
                    list.add(node.val);
                    if (node.right != null) stack1.push(node.right);
                    if (node.left != null) stack1.push(node.left);
                }
                height++;
                res.add(list);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
