package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/0100-0199/0111.Minimum%20Depth%20of%20Binary%20Tree/Solution.java
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
        //TreeNode root = {5,4,8,11,null,13,4,7,2,null,null,null,1};
        int targetSum = 22;

        //--------------------------------------------------------------------------------------------------------------

        //return dfs(root, targetSum);

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }

//    private boolean dfs(TreeNode root, int s) {
//        if (root == null) {
//            return false;
//        }
//        s -= root.val;
//        if (root.left == null && root.right == null && s == 0) {
//            return true;
//        }
//        return dfs(root.left, s) || dfs(root.right, s);
//    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

