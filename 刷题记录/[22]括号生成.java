//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：["()"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 8 
// 
// Related Topics 字符串 动态规划 回溯 👍 2475 👎 0


import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) return res;
        dfs("", n, n ,res);
        return res;
    }
    private void dfs(String curStr, int left, int right, List<String> res) {
        if (left == 0 && right == 0) {
            res.add(curStr);
            return;
        }
        if (left > right) return;
        if (left > 0) dfs(curStr + "(", left - 1, right, res);
        if (right > 0) dfs(curStr + ")", left, right - 1, res);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
