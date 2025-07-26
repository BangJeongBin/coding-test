package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0100-0199/0108.Convert%20Sorted%20Array%20to%20Binary%20Search%20Tree/Solution.java
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * Definition for a binary tree node.
         * public class TreeNode {
         *     int val;
         *     TreeNode left;
         *     TreeNode right;
         *     TreeNode() {}
         *     TreeNode(int val) { this.val = val; }
         *     TreeNode(int val, TreeNode left, TreeNode right) {
         *         this.val = val;
         *         this.left = left;
         *         this.right = right;
         *     }
         * }
         */

        // Testcase
        int[] nums = {-10, -3, 0, 5, 9};

        //--------------------------------------------------------------------------------------------------------------

//        this.nums = nums;
//        return dfs(0, nums.length - 1);

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }

//    private TreeNode dfs(int l, int r) {
//        if (l > r) {
//            return null;
//        }
//        int mid = (l + r) >> 1;
//        return new TreeNode(nums[mid], dfs(l, mid - 1), dfs(mid + 1, r));
//    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

