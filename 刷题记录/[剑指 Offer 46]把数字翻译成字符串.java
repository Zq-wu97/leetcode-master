//给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可
//能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。 
//
// 
//
// 示例 1: 
//
// 输入: 12258
//输出: 5
//解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi" 
//
// 
//
// 提示： 
//
// 
// 0 <= num < 2³¹ 
// 
// Related Topics 字符串 动态规划 👍 384 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int translateNum(int num) {
        int a = 1;
        int b = 1;
        int x = num % 10;
        int y = num % 10;
        while (num != 0) {
            num /= 10;
            x = num % 10;
            int c = (10 * x + y) >= 10 && (10 * x + y) <= 25 ? a + b : a;
            b = a;
            a = c;
            y = x;
        }
        return a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
