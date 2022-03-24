//找出数组中重复的数字。 
//
// 
//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请
//找出数组中任意一个重复的数字。 
//
// 示例 1： 
//
// 输入：
//[2, 3, 1, 0, 2, 5, 3]
//输出：2 或 3 
// 
//
// 
//
// 限制： 
//
// 2 <= n <= 100000 
// Related Topics 数组 哈希表 排序 👍 745 👎 0


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    Set<Integer> set = new HashSet<Integer>();
    public int findRepeatNumber(int[] nums) {
//        // 哈希表
//        int repeat = -1;
//        for (int num :
//                nums) {
//            if (!set.contains(num)) {
//                set.add(num);
//            } else {
//                repeat = num;
//                break;
//            }
//        }
//        return repeat;

        //原地交换
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[nums[i]] == nums[i]) return nums[i];
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
