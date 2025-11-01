package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3200-3299/3217.Delete%20Nodes%20From%20Linked%20List%20Present%20in%20Array/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] nums = {1, 2, 3};
        //ListNode head = [1,2,3,4,5];

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

//        Set<Integer> s = new HashSet<>();
//        for (int x : nums) {
//            s.add(x);
//        }
//        ListNode dummy = new ListNode(0, head);
//        for (ListNode pre = dummy; pre.next != null;) {
//            if (s.contains(pre.next.val)) {
//                pre.next = pre.next.next;
//            } else {
//                pre = pre.next;
//            }
//        }
//        return dummy.next;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

