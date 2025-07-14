package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/1200-1299/1290.Convert%20Binary%20Number%20in%20a%20Linked%20List%20to%20Integer/Solution.java
public class Main {

    private int[][] events;
    private int[][] f;
    private int n;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        //ListNode head = {1, 0, 1};

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

        int ans = 0;
        for (; head != null; head = head.next) {
            ans = ans << 1 | head.val;
        }
        //return ans;

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

