//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 栈 递归 链表 双指针 👍 248 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

//    public class ListNode {
//        int val;
//        ListNode next;
//
//        public ListNode(int val) {
//            this.val = val;
//        }
//    }

    public int[] reversePrint(ListNode head) {
        //反转链表
//        ListNode cur = head.next;
//        ListNode temp;
//        int length = 1;
//
//        if (head == null) {
//            return null;
//        }
//
//        while (cur != null) {
//            temp = cur.next;
//            cur.next = head;
//            head = cur;
//            cur = temp;
//            length++;
//        }
//
//        int[] result = new int[length];
//        int i = 0;
//        while (head != null) {
//            result[i] = head.val;
//            i++;
//            head = head.next;
//        }
//        return result;

        //栈
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        int size = stack.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = stack.pop();
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
