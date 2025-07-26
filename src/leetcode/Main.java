package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0100-0199/0110.Balanced%20Binary%20Tree/Solution.java
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
        //TreeNode root = {3, 9, 20, null, null, 15, 7};

        //--------------------------------------------------------------------------------------------------------------

        //return height(root) >= 0;

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }

//    private int height(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int l = height(root.left);
//        int r = height(root.right);
//        if (l == -1 || r == -1 || Math.abs(l - r) > 1) {
//            return -1;
//        }
//        return 1 + Math.max(l, r);
//    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

