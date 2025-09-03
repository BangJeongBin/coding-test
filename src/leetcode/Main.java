package leetcode;

import java.io.IOException;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0200-0299/0203.Remove%20Linked%20List%20Elements/Solution.java
public class Main {

    public static void solution() throws IOException {

        /**
         * Definition for singly-linked list.
         * public class ListNode {
         *     int val;
         *     ListNode next;
         *     ListNode() {}
         *     ListNode(int val) { this.val = val; }
         *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         * }
         */

        // Testcase
        //LinkNode head = [1,2,6,3,4,5,6];
        int val = 6;

        //--------------------------------------------------------------------------------------------------------------

        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        while (pre.next != null) {
            if (pre.next.val != val)
                pre = pre.next;
            else
                pre.next = pre.next.next;
        }
        return dummy.next;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

