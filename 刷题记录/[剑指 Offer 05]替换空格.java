//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// Related Topics 字符串 👍 227 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        int length = s.length();
        char[] arr = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char str = s.charAt(i);
            if (str == ' ') {
                arr[size++] = '%';
                arr[size++] = '2';
                arr[size++] = '0';
            } else {
                arr[size++] = str;
            }
        }
        String newString = new String(arr,0,size);
        return newString;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
