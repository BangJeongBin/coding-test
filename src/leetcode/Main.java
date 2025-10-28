package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0000-0099/0002.Add%20Two%20Numbers/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        //ListNode l1 = [2,4,3];
        //ListNode l2 = [5,6,4];

        //--------------------------------------------------------------------------------------------------------------

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

//        ListNode dummy = new ListNode(0);
//        int carry = 0;
//        ListNode cur = dummy;
//        while (l1 != null || l2 != null || carry != 0) {
//            int s = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
//            carry = s / 10;
//            cur.next = new ListNode(s % 10);
//            cur = cur.next;
//            l1 = l1 == null ? null : l1.next;
//            l2 = l2 == null ? null : l2.next;
//        }
//        return dummy.next;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

